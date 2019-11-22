package com.company.model;

public class Main {

    public static void main(String[] args) {
        Model model = new Model(50, 150);
        View view = new View();

        Controller controller = new Controller(model, view);

        controller.runGame();
    }
}
