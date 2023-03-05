package com.example.demo.model;

public class Game {

    private Status status;
    private Ball ball;
    
    public Game(Ball ball) {
        this.status = Status.IN_PROGRESS;
        this.ball = ball;
    }

}