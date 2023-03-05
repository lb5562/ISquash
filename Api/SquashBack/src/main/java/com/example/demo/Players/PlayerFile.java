package com.example.demo.Players;


import java.io.File;
import java.io.IOException;
import java.security.KeyStore.LoadStoreParameter;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlayerFile implements PlayDAOInterface{
    Map<String,Player> players;
    private ObjectMapper objectMapper;
    private String filename;

    public PlayerFile(@Value("${players.file}") String filename, ObjectMapper object){
        this.filename = filename;
        this.objectMapper = object;
        load();
    }

    private boolean load() throws IOException{
        players = new TreeMap<>();

        Player[] playerArray = objectMapper.readValue(new File(filename));
        for (Player player: playerArray){
            players.put(player.getName(),player);
        }

        return true;
    }
    
    private boolean save() throws IOException{
    }



    @Override
    public Players[] getPlayers() throws IOException {
        ArrayList playerList = new ArrayList<>();
        return null;
    }

}

