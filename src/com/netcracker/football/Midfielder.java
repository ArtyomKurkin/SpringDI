package com.netcracker.football;

public class Midfielder implements Position{
    public void inTheSquad(){
        System.out.println("Midfielder is in the squad!");
    }
    public void redCard(){
        System.out.println("Ohhh! Midfielder was removed from the field!");
    }

    public void goal() {
        System.out.println("Midfielder score the goal!");
    }

    @Override
    public String toString() {
        return "Midfielder";
    }
}
