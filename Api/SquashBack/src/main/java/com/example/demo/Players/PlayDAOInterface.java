package com.example.demo.Players;

import java.io.IOException;

public interface PlayDAOInterface{

    Player getPlayer(String name) throws IOException;

    Player[] getPlayers() throws IOException;

   // Player createPlayer(String name) throws IOException;
    Player updatePlayer(String name) throws IOException;

}