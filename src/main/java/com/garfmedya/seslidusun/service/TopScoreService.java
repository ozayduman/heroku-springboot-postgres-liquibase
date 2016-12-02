package com.garfmedya.seslidusun.service;

import com.garfmedya.seslidusun.entity.TopScore;

/**
 * Created by ozayd on 1.12.2016.
 */
public interface TopScoreService {
    void updateTopScore(TopScore newScore);

    TopScore getTopScore();
}
