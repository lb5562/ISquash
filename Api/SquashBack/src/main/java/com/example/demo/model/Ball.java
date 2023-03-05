package com.example.demo.model;

public enum Ball {
    ORANGE("Orange", "Super slow", "Super low", "High altitute play", .10),
    DOUBLE_YELLOW("Double Yellow", "Slow", "Very low", "Experienced players", .05),
    YELLOW("Yellow", "Slow", "Low", "Advanced", .04),
    GREEN("Green", "Medium", "Average", "Advanced", .03),
    RED("Red", "Medium", "High", "Beginners", .02),
    BLUE("Blue", "Fast", "Very high", "Juniors and new players", .01);

    private final String color;
    private final String bounce;
    private final String speed;
    private final String playerLvl;
    private final double multiplier;

    private Ball(String color, String bounce, String speed, String playerLvl, double multiplier){
        this.color=color;
        this.bounce=bounce;
        this.speed=speed;
        this.playerLvl=playerLvl;
        this.multiplier=multiplier;
    }

    public String getColor() {
        return color;
    }

    public String getBounce() {
        return bounce;
    }

    public String getSpeed() {
        return speed;
    }

    public String getPlayerLvl() {
        return playerLvl;
    }

    public double getMultiplier() {
        return multiplier;
    }
    
}