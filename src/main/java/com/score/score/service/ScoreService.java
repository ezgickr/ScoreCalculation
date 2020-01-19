package com.score.score.service;

import com.score.score.model.SearchVolume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ScoreService {

    @Autowired
    AmazonService amazonService;

    /**
     * Calls autocomplete API in parallel way for all substrings such as "i", "ip",.., "iphone charger".
     * AutoComplete API is called keyword.length() times.
     * "count" variable counts in how many results whole keyword returns exactly itself
     * @param keyword : "i", "ip",.., "iphone charger"
     * @return
     */
    public SearchVolume calculateScore(String keyword) {

        IntStream stream = IntStream.range(1, keyword.length()+1);
        List<List<String>> keywordList = stream.parallel()
                .mapToObj(i -> keyword.substring(0, i))
                .map(m-> amazonService.getKeywordList(m))
                .collect(Collectors.toList());

        SearchVolume score = new SearchVolume();

        int count = 0;
        for(int i = 0; i<keywordList.size(); i++){
            if(keywordList.get(i).contains(keyword)){
                count++;
            }
        }

        score.setScore(calculation(keyword,count));
        score.setKeyword(keyword);
        return score;
    }

    /**
     * AutoComplete API is called keyword.length() times in calculateScore method.
     * If keyword occurs in all results, count can be max(keyword.length()) and min 1
     * If count equals to keyword length the method returns the highest value.
     * @param keyword
     * @param count : total occurrence of keyword
     * @return
     */
    public Integer calculation(String keyword, int count){
        Double countD = new Double(count);
        Double cal= countD/keyword.length();
        return (int)((cal)*100);
    }
}
