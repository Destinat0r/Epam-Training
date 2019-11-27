package controller;

import model.Model;
import model.Subscriber;
import view.View;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Subscriber subscriber = model.getSubscriber();

        subscriber.setAllSubscriberInfo(UserInputReader.promptSubscriberInfo());
        subscriber.init();

        System.out.println(subscriber);
    }
}
