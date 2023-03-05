package com.example.demo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import com.example.demo.model.Game;

public interface GameDAOInterface {
    
        Game getGame() throws IOException;
    
        Game[] getGames() throws IOException;
    
    // Game createGame(String name) throws IOException;
        Game updateGame(Game g) throws IOException;

        Game createGame(Game g) throws IOException;
}
