package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("players")
public class PlayerAPI{
    private PlayDAOInterface playerFile;
    private  static final Logger LOG = Logger.getLogger(PlayerAPI.class.getName());
    public PlayerAPI(PlayDAOInterface p){
        this.playerFile = p;
    }

    @GetMapping("")
    public   ResponseEntity<Player[]> getPlayers() {
       
        try {
            Player[] playerList = playerFile.getPlayers();

            if (playerList.length == 0) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<Player[]>(playerList, HttpStatus.OK);
            }

        } catch(IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{name}")
    public ResponseEntity<Player> getPlayer(@PathVariable String name){
        try{
            Player player = playerFile.getPlayer(name);
            System.out.println(player);
            if(player !=null){
                return new ResponseEntity<>(player,HttpStatus.OK);

            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        }catch(IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        
        try {
            Player p = playerFile.updatePlayer(player);
            if (p == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<Player>(p, HttpStatus.OK);
            }
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}