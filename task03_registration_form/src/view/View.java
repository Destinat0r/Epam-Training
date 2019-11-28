package view;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class View {

    private ResourceBundle regexBundle;
    private ResourceBundle messageBundle;

    public View() {
        regexBundle = ResourceBundle.getBundle("regex_patterns", new Locale("en"));
        messageBundle = ResourceBundle.getBundle("messages", new Locale("en"));
    }

    public void promptForLocale(Scanner scanner) {
        print("To switch language to Ukrainian enter 'ua', to continue with English press 'Enter'");
        String userInput = scanner.nextLine();

        while (!userInput.equals("ua") || !userInput.equals("")) {
            print("Unknown locale. Press 'Enter' to continue with English, or type 'ua' to switch to Ukrainian");
            userInput = scanner.nextLine();
        }

        if (userInput.equals("ua")) {
            messageBundle = ResourceBundle.getBundle("messages", new Locale("ua", "UA"));
        }
    }

    public void print(String message) {
        System.out.println(message);
    }
}
