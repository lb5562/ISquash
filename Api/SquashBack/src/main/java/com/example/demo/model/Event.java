package com.example.demo.model;

public class Event {
    
    private String descrption;
    private EventType type;
    private boolean success;

    public Event(String description, EventType type, boolean success) {
        this.descrption = description;
        this.type = type;
        this.success = success;
    }

    public String getDescrption() {
        return descrption;
    }

    public EventType getType() {
        return type;
    }

    public boolean is_success() {
        return success;
    }

}