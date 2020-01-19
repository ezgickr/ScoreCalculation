package com.score.score.controller;

import com.score.score.model.SearchVolume;
import com.score.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    //estimate?keyword=iphone+charger
    @GetMapping("/estimate")
    public SearchVolume getScore(@RequestParam String keyword){
        return scoreService.calculateScore(keyword);
    }
}
