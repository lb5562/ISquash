package com.example.demo.model;
import java.util.Random;

import com.example.demo.Players.Player;

public class Game {

    private Status status;
    private Ball ball;
    private Player player1;
    private Player player2;
    private User user;
    private Event[] events;
    
    public Game(Ball ball, Player player1, Player player2, User user) {
        this.status = Status.IN_PROGRESS;
        this.ball = ball;
        this.player1 = player1;
        this.player2 = player2;
        this.user = user;
    }

    /**
     * Keep playing rounds unntil a player has a score greater than or equal to
     * 11 and they are at least 2 points ahead of the other player.
     */
    public void start() {
        
    }

    private void round(Player p1, Player p2) {
        serve(p1, p2);
        move(p2, p1);
        hit(p2, p1);
    }

    private Event serve(Player p1, Player p2) {
        boolean success = getSuccess(p1.getFrontHand(), p1.getInfluence(), p2.getBackHand(), p2.getInfluence());
        return getEvent(EventType.SERVE, success);
    }

    private Event move(Player p1, Player p2) {
        boolean success = getSuccess(p1.getAgility(), p1.getInfluence(), p2.getAgility(), p2.getInfluence());
        return getEvent(EventType.MOVE, success);
    }

    private Event hit(Player p1, Player p2) {
        boolean success = getSuccess(p1.getBackHand(), p1.getInfluence(), p2.getFrontHand(), p2.getInfluence());
        return getEvent(EventType.HIT, success);
    }

    private Event getEvent(EventType type, boolean success){
        return new Event("None", type, true);
    }

    private boolean getSuccess(double skill1, double inf1, double skill2, double inf2) {
        Random rand = new Random();
        double num = Math.round(rand.nextDouble()*100)/100.00;
        return (skill1 * inf1) / (skill2 * inf2) <= num;
    }

}