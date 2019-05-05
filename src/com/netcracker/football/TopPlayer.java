package com.netcracker.football;

public class TopPlayer extends Player {
    String emotions;

    @Override
    public String toString() {
        return "Position=" + position.toString() +
                ", age=" + age +
                ", number=" + number+". "+emotions;
    }

    public String getEmotions() {
        return emotions;
    }

    public void setEmotions(String emotions) {
        this.emotions = emotions;
    }
}
