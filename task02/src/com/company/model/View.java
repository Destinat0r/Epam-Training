package com.company.model;

import java.util.List;

public class View {

    private String startMessage = "Welcome to \"Guess the number\" Game!\nTry to guess "
                                          + "the secret number";
    private String biggerMessage = "Bigger then ";
    private String smallerMessage = "Smaller then ";
    private String guessedMessage = "Congratulations! You've guessed!";
    private String promptMessage = "Please, enter an int";
    private String invalidInputMessage = "Invalid input!";
    private String wrongRangeMessage = "Think again!";

    public void printStartMessage(int min, int max) {
        print(startMessage + " from " + min + " to " + max);
    }

    public void printPromptInRange(int min, int max) {
        print(promptMessage + " in range [" + min + ", " + max + "]");
    }

    private void print(String message) {
        System.out.println(message);
    }

    public void printInvalidInput() {
        print(invalidInputMessage);
    }

    public void printBiggerThan(int guess) {
        print(biggerMessage + guess);
    }

    public void printSmallerThan(int guess) {
        print(smallerMessage + guess);
    }

    public void printGuessed() {
        print(guessedMessage);
    }

    public void printStats(List<Integer> stats) {
        print("============== STATS ==============");
        print("You have guessed, using " + stats.size() + " tries!\n");

        for (int i = 0; i < stats.size(); i++) {
            print("Guess #" + (i + 1) + " ------- " + stats.get(i));
        }
    }

    public void printWrongRangeInput() {
        print(wrongRangeMessage);
    }
}
