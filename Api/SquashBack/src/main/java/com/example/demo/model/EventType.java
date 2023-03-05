package com.example.demo.model;

public enum EventType {
    SERVE("serve"),
    MOVE("move"),
    HIT("hit");

    private final String text;
    private EventType(String text){
        this.text=text;
    }
    
}