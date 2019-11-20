package com.randomsoft;

public class Main {

    public static void main(String[] args) {
        Model model = new Model("Hello", "Java!");
        View view = new View();

        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }
}
