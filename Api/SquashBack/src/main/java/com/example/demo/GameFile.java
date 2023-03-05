package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.example.demo.model.Game;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GameFile  implements GameDAOInterface {
    Map<Integer,Game> games;
    private ObjectMapper objectMapper;
    private String filename;
    
    public GameFile(@Value("${games.file}") String filename, ObjectMapper object) throws IOException{
        this.filename = filename;
        this.objectMapper = object;
        load();
        
    }
    private boolean load() throws IOException{
        games = new TreeMap<Integer,Game>();
 
         Game[] gameArray = objectMapper.readValue(new File(filename),Game[].class);
         int count =0;
         for (Game g: gameArray){
             games.put(count,g);
             count++;
         }
 
         return true;
     }


    @Override
    public Game getGame() throws IOException {
        synchronized(games){
        
        Game[] gameArray= getGameArray();

        return gameArray[gameArray.length-1];
        }
    }

    private Game[] getGameArray() throws IOException{
        ArrayList<Game> gameList = new ArrayList<Game>();

        for( Game g:games.values()){
            gameList.add(g);
        }
        Game[] gameArray = new Game[games.size()];
        gameList.toArray(gameArray);
        return gameArray;
    }

    @Override
    public Game[] getGames() throws IOException {
       
        synchronized(games){
            return getGameArray();
        }
    }

    @Override
    public Game updateGame(Game g) throws IOException {
        int count =0;
        for (Game game: games.values()){
           
                games.put(count,g);
                save();
                return g;
            
            count++;
        }
        return null;
    }

    public void save() throws IOException{
        Game[] gameArray = getGameArray();

        objectMapper.writeValue(new File(filename),gameArray);
    }

    @Override
    public Game createGame(Game g) throws IOException {
        int count = games.size();
        games.put(count,g);
        return g;
    }



}
    
