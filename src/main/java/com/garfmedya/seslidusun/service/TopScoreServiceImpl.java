package com.garfmedya.seslidusun.service;

import com.garfmedya.seslidusun.entity.TopScore;
import com.garfmedya.seslidusun.repository.TopScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by ozayd on 1.12.2016.
 */
@Service
@Transactional
public class TopScoreServiceImpl implements  TopScoreService{

    @Autowired
    private TopScoreRepository repository;

    @Override
    public TopScore getTopScore(){
        return findTopScore();
    }

    @Override
    public void updateTopScore(TopScore newScore){
        TopScore topScore = findTopScore();
        if(topScore!=null ){
            topScore.setNickName(newScore.getNickName());
            topScore.setScore(newScore.getScore());
        }else{
            repository.save(newScore);
        }
    }

    private TopScore findTopScore() {
        Iterable<TopScore> topScores = repository.findAll();
        TopScore topScoreToUpdate = null;
        for (TopScore  topscore:topScores) {
            topScoreToUpdate =topscore;
        }
        return topScoreToUpdate;
    }
}
