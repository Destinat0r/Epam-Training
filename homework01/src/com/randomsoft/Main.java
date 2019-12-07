package com.randomsoft;

public class Main {

    public static void main(String[] args) {

        /* keywords could be taken from config or any other source */
        Model model = new Model("Hello", "Java!");
        View view = new View();

        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }
}
