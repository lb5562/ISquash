package com.example.demo.model;

public enum EventType {
    SERVE("serve"),
    MOVE("move"),
    HIT("hit"),
    KNOCKED_OUT("knocked out!"),
    LOST("lost");

    private final String text;
    private EventType(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }
    
}