package main.java.com.example.demo.Players;


import java.io.File;
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
        
    }

}

