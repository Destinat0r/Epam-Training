package com.company;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runGame() {
        int secretNumber = model.getSecretNumber();
        Scanner scanner = new Scanner(System.in);

        view.printStartMessage(model.getMin(), model.getMax());

        while (!model.isWon()) {
            checkAndRespond(promptInput(scanner), secretNumber);
        }

        view.printCongrats();
        view.printStats(model.getStats());
        scanner.close();
    }

    private void checkAndRespond(int input, int secretNumber) {
        if (input == secretNumber) {
            updateForGuessed(input);

        } else if(!model.isInRange(input)) {
            view.printWrongRangeInput();

        } else if (input < secretNumber) {
            updateForSmaller(input);
            view.printBiggerThan(input);

        } else if (input > secretNumber) {
            updateForBigger(input);
            view.printSmallerThan(input);
        }
    }

    private int promptInput(Scanner scanner) {
        int min = model.getMin();
        int max = model.getMax();
        view.printPromptRange(min, max);

        while (!scanner.hasNextInt()) {
            view.printInvalidInput();
            view.printPromptRange(min, max);
            scanner.next();
        }

        return scanner.nextInt();
    }

    private void updateForGuessed(int input) {
        model.addToStats(input);
        model.setWon();
    }

    private void updateForSmaller(int input) {
        model.addToStats(input);
        model.setMin(input);
    }

    private void updateForBigger(int input) {
        model.addToStats(input);
        model.setMax(input);
    }
}
