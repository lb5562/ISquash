package com.example.demo;

public interface PlayerInterface {
    String getName();

    void setName(String n);

    void setWins(int w);

    int getWins();
    int getLoses();
    void setLoses(int l);
    /**
     *  Each Skill is Rated between 0-1, and will be used to figure out precentage of success
     * 
     */

     //Serving skll = change of faulting

     double getServe();

     void setServe(double s);



     double getBackHand();

     void setBackh(double b);

     double getFrontHand();
     void setFronth(double f);

     

     double getAgility();

     void setAgility(double a);

     double getHealth();

     void setHealth(double h);

     double getInfluence();
     void setInfluence(double i);

}
