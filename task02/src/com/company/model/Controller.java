package com.company.model;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        int secretNumber = Model.generator.rand(0, 100);
    }

    public void checkInput(int input) {

    }
}
