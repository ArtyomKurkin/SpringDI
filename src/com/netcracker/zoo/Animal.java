package com.netcracker.zoo;

public class Animal implements InterfaceAnimal{
    String name;
    String food;

    public void info(){
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
