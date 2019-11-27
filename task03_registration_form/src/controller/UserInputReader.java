package controller;

import view.FieldMessages;

import java.util.Scanner;

public class UserInputReader {


    public void promptSubscriberInfo() {
        Scanner scanner = new Scanner(System.in);

        int numberOfFields = FieldMessages.messages.length;

        for (int i = 0; i < numberOfFields; i++) {
            System.out.println(FieldMessages.messages[i]);
            String userInput = scanner.nextLine();

            while (!userInput.matches(Regex.patterns[i])) {
                System.out.println(FieldMessages.invalidInput);
                System.out.println(FieldMessages.messages[i]);
                userInput = scanner.nextLine();
            }
        }
    }
}
