package org.example;

import java.util.Random;

public class Player {

    private int countWins = 0;

    private int countLoosed = 0;

    private GameChoice choice;

    public void makeRandomChoice() {
        Random random = new Random();
        choice = GameChoice.values()[random.nextInt(GameChoice.values().length)];
    }

    public int getCountWins() {
        return countWins;
    }

    public int getCountLoosed() {
        return countLoosed;
    }

    public GameChoice getChoice(GameChoice rock) {
        return choice;
    }

    public void setCountWins(int countWins) {
        this.countWins = countWins;
    }

    public void setCountLoosed(int countLoosed) {
        this.countLoosed = countLoosed;
    }

    @Override
    public String toString() {
        return "Player{" +
                "countWins=" + countWins +
                ", countLoosed=" + countLoosed +
                ", choice=" + choice +
                '}';
    }
}
