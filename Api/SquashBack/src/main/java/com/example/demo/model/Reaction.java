package com.example.demo.model;

public abstract class Reaction {
    private double influence;
    
    public void perform() {
    }

    public Reaction(double influence) {
        this.influence = influence;
    }

    public double getInfluence() {
        return influence;
    }
}