package com.example.demo.view;

import java.util.Scanner;

import com.example.demo.model.Ball;
import com.example.demo.model.Game;
import com.example.demo.model.User;

public class SquashPTUI {

    public static void main(String[] args) {
        Game game = new Game(Ball.DOUBLE_YELLOW, null, null, null);

        Ball ball;
        // Player p1;
        // Player p2;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter username:");

            String userName = scanner.nextLine();  // Read user input
            User user = new User(0, userName);

            String options = "1) Orange\n2) Double Yellow\n3) Yellow\n4) Green\n5) Red\n6) Blue\n";
            System.out.println("Choose a ball:\n" + options);

            


        }

    }

}