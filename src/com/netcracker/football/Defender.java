package com.netcracker.football;

public class Defender implements Position{
    public void inTheSquad(){
        System.out.println("Defender is in the squad!");
    }
    public void redCard(){
        System.out.println("Ohhh! Defender was removed from the field!");
    }

    public void goal() {
        System.out.println("Defender score the goal!");
    }

    @Override
    public String toString() {
        return "Defender";
    }
}
