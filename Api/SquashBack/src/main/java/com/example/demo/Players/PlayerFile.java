package main.java.com.example.demo.Players;

import com.example.demo.Players.Player;
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
        Player[] playerArray = getPlayerArray();

        objectMapper.writeValue(new File(filename),playerArray);
    return true;
    }



    @Override
    public Players[] getPlayers() throws IOException {
       synchronized(players){
        return getPlayerArray();
       }
    }

    private Players[] getPlayerArray() throws IOException{
        ArrayList<Player> playerList = new ArrayList<Player>();

        for( Player p:players.values()){
            playerList.add(p);
        }
        Player[] playerArray = new Player[players.size()];
        playerList.toArray(playerArray);
        return playerArray;
    }

    @Override
    @Override
    public Player updatePlayer(Player p) throws IOException {
        synchronized(players){
            if(players.containsKey(p.getName())){
                players.replace(p.getName(), p);
                save();
                return p;
            }else{
                save();
                return null;
            }

        }
    }
    @Override
    public Player getPlayer(String name) throws IOException {
        synchronized(players){
        return players.get(name);
        }
    }

}

