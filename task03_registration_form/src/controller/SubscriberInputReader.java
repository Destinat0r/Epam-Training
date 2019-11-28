package controller;

import view.InputMessages;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SubscriberInputReader {

    private static ResourceBundle regexBundle = ResourceBundle.getBundle("regex_patterns", new Locale("en"));

    public static ArrayList<String> promptSubscriberInfo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allSubscriberInfo = new ArrayList<>();

        int numberOfFields = InputMessages.messages.length;

        for (int i = 0; i < numberOfFields; i++) {
            System.out.println(InputMessages.messages[i]);

            allSubscriberInfo.add(promptUserUntilValidInput(scanner, i));
        }
        return  allSubscriberInfo;
    }

    private static String promptUserUntilValidInput(Scanner scanner, int messageCounter) {
        String userInput = scanner.nextLine();

        while (!userInput.matches(RegexPatterns.patterns[messageCounter])) {
            System.out.println(InputMessages.invalidInput);
            System.out.println(InputMessages.messages[messageCounter]);
            userInput = scanner.nextLine();
        }

        return userInput;
    }

    public String takeRegexFromBundle(String regex) {
        return regexBundle.getString(regex );
    }

}
