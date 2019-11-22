package com.company;

import java.util.List;

public class View {

    private String startMessage = "Welcome to \"Secret Integer\"!\nTry to guess "
                                          + "the integer number from %d to %d!\n";
    private String biggerMessage = "Bigger then %d!\n";
    private String smallerMessage = "Smaller then %d!\n";
    private String guessedMessage = "Congratulations! You've guessed!";
    private String promptMessage = "Please, enter an integer in range [%d, %d].\n";
    private String invalidInputMessage = "Invalid input!";
    private String wrongRangeMessage = "Think again!";
    private String gameResultsMessage = "============= STATS ============ \nYou have guessed using %d tries!\n";
    private String guessInfo = "Guess #%d ------- %d\n";

    public void printStartMessage(int min, int max) {
        System.out.printf(startMessage, min, max);
    }

    public void printPromptRange(int min, int max) {
        System.out.printf(promptMessage, min, max);
    }

    public void printInvalidInput() {
        System.out.println(invalidInputMessage);
    }

    public void printBiggerThan(int guess) {
        System.out.printf(biggerMessage, guess);
    }

    public void printSmallerThan(int guess) {
        System.out.printf(smallerMessage, guess);
    }

    public void printGuessed() {
        System.out.println(guessedMessage);
    }

    public void printStats(List<Integer> stats) {
        System.out.printf(gameResultsMessage, stats.size());

        for (int i = 0; i < stats.size(); i++) {
            System.out.printf(guessInfo, i + 1, stats.get(i));
        }
    }

    public void printWrongRangeInput() {
        System.out.println(wrongRangeMessage);
    }
}
