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
     * Keep playing rounds until a player has a score greater than or equal to
     * 11 and they are at least 2 points ahead of the other player.
     */
    public Event start() {
        Player p1 = player1;
        Player p2 = player2;
        Player placeholder;
        Event event = null;

        while(scoreLessThanEleven(p1, p2)){
            event = serve(p1, p2);
            if (!event.is_success()) {
                return event;
            }
            event = move(p2, p1);
            if (!event.is_success()) {
                return event;
            }
            event = hit(p2, p1);
            if (!event.is_success()) {
                return event;
            }
            // Check for knocked out players
            if (getPassedOut(p1, p2) != null) {
                return new Event(p1.getName(), EventType.KNOCKED_OUT, false);
            }
            // Check for winning score
            if ((!scoreLessThanEleven(p1, p2) && twoPointDiff(p1, p2))){
                Player loser = p1.getScore() < p2.getScore() ? p1 : p2; 
                return new Event(loser.getName(), EventType.LOST, false);
            }
            // Switch servers
            placeholder = p1;
            p1 = p2;
            p2 = placeholder;
        }
        return event;
    }

    private boolean isPassedOut(Player player) {
        return player.getHealth() <= 0;
    }

    private Player getPassedOut(Player p1, Player p2) {
        if (isPassedOut(p1))
            return p1;
        if (isPassedOut(p2))
            return p2;
        return null;
    }

    private boolean scoreLessThanEleven(Player p1, Player p2){
        return p1.getScore() < 11 && p2.getScore() < 11;
    }

    private boolean twoPointDiff(Player p1, Player p2) {
        return Math.abs(p1.getScore() - p2.getScore()) >= 2;
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
        num = num - ball.getMultiplier() > 0 ? num - ball.getMultiplier() : 0;
        double numerator; 
        numerator = inf1 <= 0 ? 1 : inf1;
        double denomiator;
        denomiator = inf2 <= 0 ? 1 : inf2;

        return (numerator) / (denomiator) <= num;
    }

}