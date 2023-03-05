package main.java.com.example.demo.Players;

public interface PlayerInterface {
    String getName();

    String setName();

    int setWins();

    int getWins();

    /**
     *  Each Skill is Rated between 0-1, and will be used to figure out precentage of success
     * 
     */

     //Serving skll = change of faulting

     int getServe();

     void setServe();

     int getBackHand();

     void setBackh();

     int getFrontHand();
     void setFrontH();
     int getAgility();
     void setAgility();
     int getHealth();
     void setHealth();

}
