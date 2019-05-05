package com.netcracker.football;

public class Goalkeaper implements Position{
    public void inTheSquad(){
        System.out.println("Goalkeaper is in the squad!");
    }
    public void redCard(){
        System.out.println("Ohhh! Goalkeaper was removed from the field!");
    }

    public void goal() {
        System.out.println("Goalkeaper score the goal!");
    }

    @Override
    public String toString() {
        return "Goalkeaper";
    }
}
