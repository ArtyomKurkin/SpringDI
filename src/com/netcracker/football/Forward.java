package com.netcracker.football;

public class Forward implements Position{
    public void inTheSquad(){
        System.out.println("Forward is in the squad!");
    }
    public void redCard(){
        System.out.println("Ohhh! Forward was removed from the field!");
    }

    public void goal() {
        System.out.println("Forward score the goal!");
    }

    @Override
    public String toString() {
        return "Forward";
    }
}
