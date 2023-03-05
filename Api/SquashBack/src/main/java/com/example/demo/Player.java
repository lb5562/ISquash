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

    @Override
    public double getAgility() {
        // TODO Auto-generated method stub
        return agility;
    }

    @Override
    public double getBackHand() {
        // TODO Auto-generated method stub
        return backh;
    }

    @Override
    public double getFrontHand() {
        // TODO Auto-generated method stub
        return fronth;
    }

    @Override
    public double getHealth() {
        // TODO Auto-generated method stub
        return health;
    }

    @Override
    public double getInfluence() {
        // TODO Auto-generated method stub
        return influence;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public double getServe() {
        // TODO Auto-generated method stub
        return serve;
    }

    @Override
    public int getWins() {
        // TODO Auto-generated method stub
        return wins;
    }

    @Override
    public void setAgility(double a) {
        this.agility = a;
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setBackh(double b) {
        // TODO Auto-generated method stub
        backh = b;
    }

    @Override
    public void setFronth( double f) {
        fronth = f;
        
    }

    @Override
    public void setHealth(double h) {
       health = h;
        
    }

    @Override
    public void setInfluence(double i) {
        influence =i;
        
    }

    @Override
    public void setName(String n) {
        // TODO Auto-generated method stub
        name = n;
    }

    @Override
    public void setServe(double s) {
        // TODO Auto-generated method stub
        serve = s;
        
    }

    @Override
    public void setWins(int w) {
        // TODO Auto-generated method stub
     wins =w;
    }

    @Override
    public void setLoses(int l){
        loses = l;
    }
    @Override
    public int getLoses(){
        return loses;
    }
   
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
    }
    
    public Player(@JsonProperty("id") int player_id,@JsonProperty("name") String  name,@JsonProperty("wins") int wins,@JsonProperty("loses")int loses,@JsonProperty("serve")  double serve,@JsonProperty("backh")  double backh, @JsonProperty("fronth") double fronth,@JsonProperty("agility") double agility,@JsonProperty("health")  double health,@JsonProperty("influence")  double influence){
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

    }


}
