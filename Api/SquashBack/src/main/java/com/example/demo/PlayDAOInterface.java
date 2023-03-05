package com.example.demo;

import java.io.IOException;

public interface PlayDAOInterface{

    Player getPlayer(String name) throws IOException;

    Player[] getPlayers() throws IOException;

   // Player createPlayer(String name) throws IOException;
    Player updatePlayer(Player p) throws IOException;

}