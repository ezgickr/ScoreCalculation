package com.score.score.service;

import com.score.score.model.Search;
import com.score.score.model.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AmazonService{


	@Autowired
    RestTemplate restTemplate;


    public List<String> getKeywordList(String keyword){

        List<String> keywords;

        try {
            keyword = keyword.replace(' ', '+');

            String urlStr = "https://completion.amazon.com/api/2017/suggestions?page-type=Gateway&lop=en_US&site-variant=desktop&client-info=amazon-search-ui&mid=ATVPDKIKX0DER&alias=aps&b2b=0&fresh=0&ks=88&event=onKeyPress&limit=11&fb=1&suggestion-type=KEYWORD&suggestion-type=WIDGET&_=1578479436682&prefix=" + keyword;
            Search search = restTemplate.getForObject(urlStr, Search.class);
            List<Suggestion> suggestions = Arrays.asList(search.getSuggestions());
            keywords = suggestions.stream().map(x -> x.getValue()).collect(Collectors.toList());

        } catch (Exception e) {
            keywords = new ArrayList<>();
        }
        return keywords;
    }
}
