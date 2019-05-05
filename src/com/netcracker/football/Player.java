package com.netcracker.football;

public class Player {
    Position position;
    int age;
    int number;

    public Player() {

    }

    public Player(Position position, int age, int number) {
        this.position = position;
        this.age = age;
        this.number = number;
    }

    public Player(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Position=" + position.toString() +
                ", age=" + age +
                ", number=" + number;
    }
}
