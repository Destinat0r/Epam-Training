package view;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class View {

    private ResourceBundle messageBundle;

    public View() {
        messageBundle = ResourceBundle.getBundle("messages", new Locale("en"));
    }

    public void promptForLocale(Scanner scanner) {
        printMessage("prompt_for_locale");
        String userInput = scanner.nextLine();

        while (!userInput.equals("ua") || !userInput.equals("")) {
            printMessage("unknown_locale");
            userInput = scanner.nextLine();
        }

        if (userInput.equals("ua")) {
            messageBundle = ResourceBundle.getBundle("messages", new Locale("ua", "UA"));
        }
    }

    public void printMessage(String message) {
        System.out.println(messageBundle.getString(message));
    }
}
