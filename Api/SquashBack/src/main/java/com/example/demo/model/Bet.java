package com.example.demo.model;

public class Bet {
    private int squashes;
    private int userId;
    
    public Bet(int squashes, int userId) {
        this.squashes = squashes;
        this.userId = userId;
    }

    public int getSquashes() {
        return squashes;
    }

    public int getUserId() {
        return userId;
    }

}