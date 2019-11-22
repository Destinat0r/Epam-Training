package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int max;
    private int min;
    private int secretNumber;
    private int currentInput;
    private boolean won = false;

    private List<Integer> stats;

    public Model(int min, int max) {
        this.min = min;
        this.max = max;
        secretNumber = IntGenerator.rand(min, max);
        this.stats = new ArrayList<>();
    }

    public boolean isInNewRange(int input, int min, int max) {
        return input >= min && input <= max;
    }

    public List<Integer> getStats() {
        return stats;
    }

    public void addToStats(int guess) {
        stats.add(guess);
    }

    public void setCurrentInput(int currentInput) {
        this.currentInput = currentInput;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon() {
        this.won = true;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
