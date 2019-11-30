package controller;

import util.UTF8Control;
import view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class InputReader {

    private static ResourceBundle regexBundle = ResourceBundle.getBundle("regex_patterns", new Locale("en"), new UTF8Control());
    private View view;
    private Scanner scanner;

    public InputReader(View view) {
        this.view = view;
        scanner = new Scanner(System.in);
    }

    public String promptUntilValidInput(String formFieldName) {
        view.printMessage(formFieldName);
        String userInput = scanner.nextLine();

        while (!userInput.matches(takeRegexFromBundle(formFieldName))) {
            view.printMessage("invalidInput");
            view.printMessage(formFieldName);
            userInput = scanner.nextLine();
        }

        return userInput;
    }


    public void promptForLocale() {
        view.printMessage("prompt_for_locale");
        String userInput = scanner.nextLine();

        while (!userInput.equals("ua") && !userInput.equals("")) {
            view.printMessage("unknown_locale");
            userInput = scanner.nextLine();
        }

        if (userInput.equals("ua")) {
            view.setLocale(new Locale("ua", "UA"));
        }
    }

    public String takeRegexFromBundle(String regex) {
        return regexBundle.getString(regex);
    }

}
