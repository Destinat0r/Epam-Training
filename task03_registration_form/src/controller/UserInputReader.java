package controller;

import view.FieldMessages;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputReader {

    public static ArrayList<String> promptSubscriberInfo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allSubscriberInfo = new ArrayList<>();

        int numberOfFields = FieldMessages.messages.length;

        for (int i = 0; i < numberOfFields; i++) {
            System.out.println(FieldMessages.messages[i]);

            allSubscriberInfo.add(promptUserUntilValidInput(scanner, i));
        }
        return  allSubscriberInfo;
    }

    private static String promptUserUntilValidInput(Scanner scanner, int messageCounter) {
        String userInput = scanner.nextLine();

        while (!userInput.matches(Regex.patterns[messageCounter])) {
            System.out.println(FieldMessages.invalidInput);
            System.out.println(FieldMessages.messages[messageCounter]);
            userInput = scanner.nextLine();
        }

        return userInput;
    }

}
