package com.garfmedya.seslidusun.entity;

import javax.persistence.*;

/**
 * Created by ozay on 11/29/2016.
 */
@Entity
@Table(name = "topscore")
public class TopScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nickname")
    private String nickName;
    @Column(name = "score")
    private int score;
    public TopScore() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
