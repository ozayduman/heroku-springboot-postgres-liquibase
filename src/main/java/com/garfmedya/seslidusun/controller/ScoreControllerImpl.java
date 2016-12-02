package com.garfmedya.seslidusun.controller;

import com.garfmedya.seslidusun.entity.TopScore;
import com.garfmedya.seslidusun.service.TopScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ozay on 11/29/2016.
 */
@RestController
public class ScoreControllerImpl implements ScoreController {
    @Autowired
    private TopScoreService topScoreService;
    @RequestMapping("/test")
    @Override
    public TopScore test(){
        TopScore topScore = new TopScore();
        topScore.setNickName("murphy");
        topScore.setScore(100);
        return topScore;
    }

    @RequestMapping(value = "/topscore", method = RequestMethod.GET)
    @Override
    public TopScore retrieveTopScore(){
        return topScoreService.getTopScore();
    }

    @RequestMapping(value = "/updatetopscore",method = RequestMethod.POST)
    @Override
    public void updateTopScore(@RequestBody TopScore newScore){
        topScoreService.updateTopScore(newScore);
    }
}
