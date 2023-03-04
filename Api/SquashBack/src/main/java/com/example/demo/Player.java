
import java.util.*;

public class Player implements PlayerInterface{
    private int id;
    private String  name;
    private int wins;
    private int loses;
    private double serve;
    private double backh;
    private double fronth;
    private double agility;
    private int health;
    private double influence;

    /**
     * @param name of the player
     */
    public Player(int id,String name){
        this.id = id;
        this.name= name;
        wins =0;
        loses = 0;
        Random rand = new Random();
        serve = r.nextDouble();
    }

}
