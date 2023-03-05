package main.java.com.example.demo.Players;

public interface PlayerInterface {
    String getName();

    String setName();

    int setWins();

    

    void getWins();

    /**
     *  Each Skill is Rated between 0-1, and will be used to figure out precentage of success
     * 
     */

     //Serving skll = change of faulting

     int getServe();

     int getBackHand();

     int getFrontHand();

     int getAgility();

     int getHealth();
     

}
