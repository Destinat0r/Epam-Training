package com.randomsoft;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        model.setMessage(makeMessageFromUserInputUsingKeywords());

        view.printMessage(model.getMessage());
    }

    private String makeMessageFromUserInputUsingKeywords() {

        String[] keywords = model.getKeywords();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        for (String keyword : keywords) {
            view.printMessage(View.INPUT_VALUE_MESSAGE + keyword);
            stringBuilder.append(promptUserUntilValidInput(scanner, keyword)).append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private String promptUserUntilValidInput(Scanner scanner, String keyword) {
        String userInput = scanner.nextLine();

        while (!userInput.equals(keyword)) {
            view.printMessage(View.WRONG_INPUT_MESSAGE);
            view.printMessage(View.INPUT_VALUE_MESSAGE + keyword);
            userInput = scanner.nextLine();
        }

        return userInput;
    }
}
