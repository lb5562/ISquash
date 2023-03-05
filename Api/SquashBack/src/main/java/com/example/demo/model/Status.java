package com.example.demo.model;

public enum Status {
    WIN("Won!"),
    LOST("Lost :("),
    IN_PROGRESS("In progress");

    private final String text;

    private Status(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }

}