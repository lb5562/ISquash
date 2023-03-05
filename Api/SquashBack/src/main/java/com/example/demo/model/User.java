package com.example.demo.model;

public class User implements Comparable<User> {
 
    private int id;
    private String name;
    private int squashes;

    static final int DEF_SQUASH_CNT = 50;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.squashes = DEF_SQUASH_CNT;
    }

    @Override
    public int compareTo(User other) {
        return this.squashes - other.getSquashes();
    }

    public int getSquashes() {return squashes;}
    public int getId() {return id;}
    public String getName() {return name;}
    public void setSquashes(int squashes) {this.squashes=squashes;}

}