package main.java.com.example.demo;
import java.util.*;

public class Player implements PlayerInterface{
    private int id;
    private String  name;
    private int wins;
    private int loses;
    private double serve;
    private double backh;
    private double fronth;
    private double agility;
    private int health;
    private double influence;

    /**
     * @param name of the player
     */
    public Player(int id,String name){
        this.id = id;
        this.name= name;
        wins =0;
        loses = 0;
        Random rand = new Random();
        serve = Math.round(r.nextDouble()*100)/100.00;
        backh = = Math.round(r.nextDouble()*100)/100.00;
        fronth = = Math.round(r.nextDouble()*100)/100.00;;
        agility = = Math.round(r.nextDouble()*100)/100.00;
        health =100.00;
        inluence =1.00;
    }

    @Override
    public String setName() {
        // TODO Auto-generated method stub
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
      return loses;   
    }
    public int getServe(){
        return serve;
    }

    public int  getfronth(){
        return fronth;
    }

    public int getbackh(){
        return backh;
    }

    public int gethealth(){
        return health;
    }

    public void sethealth(int health){
        this.health = health;
    }

    public void setInflutence(int influence){
        this.influence = influence;
    }

    public int getInfluence(){
        return influence;
    }
}
