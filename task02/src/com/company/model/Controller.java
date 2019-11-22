package com.company.model;

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
            checkInput(promptInput(scanner), secretNumber);
        }

        view.printStats(model.getStats());
    }

    private int promptInput(Scanner scanner) {
        int min = model.getMin();
        int max = model.getMax();
        view.printPromptInRange(min, max);

        while (!scanner.hasNextInt()) {
            view.printInvalidInput();
            view.printPromptInRange(min, max);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void checkInput(int input, int secretNumber) {
        if (input == secretNumber) {
            model.addToStats(input);
            view.printGuessed();
            model.setWon();

        } else if(!model.isInNewRange(input)) {
            view.printWrongRangeInput();

        } else if (input < secretNumber) {
            model.addToStats(input);
            model.setMin(input);
            view.printBiggerThan(input);

        } else if (input > secretNumber) {
            model.addToStats(input);
            model.setMax(input);
            view.printSmallerThan(input);
        }
    }
}
