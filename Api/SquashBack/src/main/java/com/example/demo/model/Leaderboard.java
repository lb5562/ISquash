package com.example.demo.model;

import java.util.Set;
import java.util.TreeSet;

public class Leaderboard {
    private Set<User> users;

    public Leaderboard() {
        this.users = new TreeSet<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

}