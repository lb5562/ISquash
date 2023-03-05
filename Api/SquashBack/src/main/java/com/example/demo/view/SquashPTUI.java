package com.example.demo.view;

import java.io.IOException;
import java.util.Scanner;

import com.example.demo.Player;
import com.example.demo.PlayerFile;
import com.example.demo.model.Ball;
import com.example.demo.model.Game;
import com.example.demo.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SquashPTUI {

    

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        PlayerFile playerFile = new PlayerFile("../players.json",objectMapper);

        Player[] players = new Player[5];
        players[0] = new Player(0, "Bob");
        players[1] = new Player(1, "Chicken Parm");
       
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter username:");

            String userName = scanner.nextLine();  // Read user input
            User user = new User(0, userName);

            String options = "1) Orange\n2) Double Yellow\n3) Yellow\n4) Green\n5) Red\n6) Blue\n";
            System.out.println("Choose a ball:\n" + options);

            int ballChoice = scanner.nextInt();  // Read user input
            Ball b = Ball.values()[ballChoice - 1];

            System.out.println("You chose: " + b);

            System.out.println("Choose your players");
            
            Player p1  = null;
            Player p2  = null;

            while (p1 == null || p2 == null) {
                System.out.println("Player Options:");
                for (Player p : players) {
                    System.out.println(p.getName());
                }
                if (p1 == null) {
                    System.out.println("Enter player 1 name:");
                    String p1Name = scanner.nextLine();
                    for (Player p : players) {
                        if (p.getName().equals(p1Name)) {
                            p1 = p;
                        }
                    }
                }
                if (p2 == null) {
                    System.out.println("Enter player 2 name:");
                    String p2Name = scanner.nextLine();
                    for (Player p : players) {
                        if (p.getName().equals(p2Name)) {
                            p2 = p;
                        }
                    }
                }
    
    
            }
        
            Game game = new Game(b, p1, p2, user);
            While(game.getStatus() == Status.IN_PROGRESS){
               game.start();
                
            }
        }

       

    }

}