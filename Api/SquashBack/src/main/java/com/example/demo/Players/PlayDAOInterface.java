package main.java.com.example.demo.Players;

import java.io.IOException;

public interface PlayDAOInterface{

    Player getPlayer(String name) throws IOException;

    Players[] getPlayers() throws IOException;

   // Player createPlayer(String name) throws IOException;
    Player updatePlayer(String name) throws IOException;

}