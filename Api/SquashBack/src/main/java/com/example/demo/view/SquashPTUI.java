package com.example.demo.view;

import java.io.IOException;
import java.util.Scanner;

import com.example.demo.Player;
import com.example.demo.PlayerFile;
import com.example.demo.model.Ball;
import com.example.demo.model.Game;
import com.example.demo.model.Status;
import com.example.demo.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SquashPTUI {

    

    public static void main(String[] args)  {

       
       
        
        try (Scanner scanner = new Scanner(System.in)) {
            Player[] players = new Player[2];
            players[0] = new Player(0, "Bob");
            players[1] = new Player(1, "Chicken Parm");

            System.out.println("Enter username:");

            String userName = scanner.nextLine();  // Read user input
            User user = new User(0, userName);

            String options = "1) Orange\n2) Double Yellow\n3) Yellow\n4) Green\n5) Red\n6) Blue\n";
            System.out.println("Choose a ball:\n" + options);

            int ballChoice = scanner.nextInt();  // Read user input
            Ball b = Ball.values()[ballChoice - 1];

            System.out.println("You chose: " + b);

            System.out.println("Choose your player #1");
            
            Player p1  = null;
            Player p2  = null;

            while (p1 == null) {
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
               
    
            }
            System.out.println("Choose your player #2");
            while(p2==null){
                for (Player p : players) {
                    System.out.println(p.getName());
                }
                System.out.println("Enter player 2 name:");
                String p2Name = scanner.nextLine();
                for (Player p : players) {
                    if (p.getName().equals(p2Name)) {
                        p2 = p;
                    }
                }
            }
            System.out.println("You chose: " + p1.getName() + " and " + p2.getName());
            System.out.println("How many squash would you like to bet?");
            int bet = scanner.nextInt();
            System,out.println("You bet: " + bet);
            System.out.println("On whitch Player? 1 or 2");
            int betOn = scanner.nextInt();
            Player bet;
            if(betOn == 1){
                bet = p1;
            }else{ bet =p2;}
        
            Game game = new Game(b, p1, p2, user);
            System.out.println("Game started!");
            while(game.getStatus() == Status.IN_PROGRESS){
               game.start();
                
            }
            System.out.println("Game over!");
            System.out.println("Winner: " + game.getWinner().getName());

            if (game.getWinner().getName() == bet.getName()) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }
                
            }
        }

       

    }

}