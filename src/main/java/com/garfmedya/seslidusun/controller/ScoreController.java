package com.garfmedya.seslidusun.controller;

import com.garfmedya.seslidusun.entity.TopScore;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ozay on 11/29/2016.
 */
public interface ScoreController {
    @RequestMapping("/test")
    TopScore test();

    TopScore retrieveTopScore();

    void updateTopScore(TopScore newScore);
}
