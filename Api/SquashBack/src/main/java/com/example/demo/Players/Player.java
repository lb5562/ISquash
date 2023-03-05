package main.java.com.example.demo.Players;
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
    @JsonProperty("health") private int health;
    @JsonProperty("influence") private double influence;

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
        backh = Math.round(r.nextDouble()*100)/100.00;
        fronth = Math.round(r.nextDouble()*100)/100.00;;
        agility = Math.round(r.nextDouble()*100)/100.00;
        health =100.00;
        inluence =1.00;
    }
    
    public Player(@JsonProperty("id") private int id,@JsonProperty("name") String  name,@JsonProperty("wins") int wins,@JsonProperty("loses")int loses,@JsonProperty("serve")  double serve,@JsonProperty("backh")  double backh, @JsonProperty("fronth") double fronth,@JsonProperty("agility") double agility,@JsonProperty("health")  int health,@JsonProperty("influence")  double influence){
        this.name = name;
        this.id=id;
        this.wins = wins;
        this.loses = loses;
        this.serve = serve;
        this.backh = backh;
        this.fronth = fronth;
        this.agility = agility;
        this.health = health;
        this.influence = influence;

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

    public int getHealth(){
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
