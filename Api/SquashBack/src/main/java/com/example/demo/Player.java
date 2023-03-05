package com.example.demo;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Player implements PlayerInterface{
    @JsonProperty("id") private int id;
    @JsonProperty("name") private String  name;
    @JsonProperty("wins") private int wins;
    @JsonProperty("loses") private int loses;
    @JsonProperty("serve") private double serve;
    @JsonProperty("backh") private double backh;
    @JsonProperty("fronth") private double fronth;
    @JsonProperty("agility") private double agility;
    @JsonProperty("health") private double health;
    @JsonProperty("influence") private double influence;
    @JsonProperty("score") private int score;

    /**
     * @param name of the player
     */
    public Player(int id,String name){
        this.id = id;
        this.name= name;
        wins =0;
        loses = 0;
        Random rand = new Random();
        serve = Math.round(rand.nextDouble()*100)/100.00;
        backh = Math.round(rand.nextDouble()*100)/100.00;
        fronth = Math.round(rand.nextDouble()*100)/100.00;;
        agility = Math.round(rand.nextDouble()*100)/100.00;
        health =100.00;
        influence =1.00;
        this.score =0;
    }
    
    public Player(@JsonProperty("id") int player_id,@JsonProperty("name") String  name,@JsonProperty("wins") int wins,@JsonProperty("loses")int loses,@JsonProperty("serve")  double serve,@JsonProperty("backh")  double backh, @JsonProperty("fronth") double fronth,@JsonProperty("agility") double agility,@JsonProperty("health")  double health,@JsonProperty("influence") double influence){
        this.name = name;
        this.id=player_id;
        this.wins = wins;
        this.loses = loses;
        this.serve = serve;
        this.backh = backh;
        this.fronth = fronth;
        this.agility = agility;
        this.health = health;
        this.influence = influence;
        this.score = 0;
    }

    public int getScore() {return score;}
    public void setScore(int score) {this.score=score;}

    @Override
    public double getAgility() {return agility;}

    @Override
    public double getBackHand() {return backh;}

    @Override
    public double getFrontHand() {return fronth;}

    @Override
    public double getHealth() {return health;}

    @Override
    public double getInfluence() {return influence;}

    @Override
    public String getName() {return name;}

    @Override
    public double getServe() {return serve;}

    @Override
    public int getWins() {return wins;}

    @Override
    public void setAgility(double a) {this.agility = a;}

    @Override
    public void setBackh(double b) {backh = b;}

    @Override
    public void setFronth( double f) {fronth = f;}

    @Override
    public void setHealth(double h) {health = h;}

    @Override
    public void setInfluence(double i) {influence =i;}

    @Override
    public void setName(String n) {name = n;}

    @Override
    public void setServe(double s) {serve = s;}

    @Override
    public void setWins(int w) {wins =w;}

    @Override
    public void setLoses(int l){loses = l;}
    @Override

    public int getLoses(){return loses;}

    @Override
    public String toString() {
        return "\nname: " + name
        + "\nscore: " + score + "\nhealth: " + health 
        + "\nbackh: " + backh + "\nfronth: " + fronth
        + "\nagilty: " + agility + "\ninfluence: " + influence + "\n";
    }

}
