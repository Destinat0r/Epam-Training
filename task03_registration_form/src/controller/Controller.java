package controller;

import model.Group;
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

        Subscriber subscriber = new Subscriber();
        InputReader inputReader = new InputReader(view);

        inputReader.promptForLocale();

        setPersonalInfo(subscriber, inputReader);
        setAdditionalInfo(subscriber, inputReader);
        setContacts(subscriber, inputReader);
        setAddress(subscriber, inputReader);

        model.setSubscriber(subscriber);
        System.out.println(subscriber);
    }

    private void setAddress(Subscriber subscriber, InputReader inputReader) {
        subscriber.setIndex(inputReader.promptUntilValidInput("index"));
        subscriber.setCity(inputReader.promptUntilValidInput("city"));
        subscriber.setStreet(inputReader.promptUntilValidInput("street"));
        subscriber.setBuilding(inputReader.promptUntilValidInput("building"));
        subscriber.setApartment(inputReader.promptUntilValidInput("apartment"));

        subscriber.setFullAddress(view.concat(subscriber.getIndex(), ", ", subscriber.getCity(),
                subscriber.getStreet(), ", ", subscriber.getBuilding(), ", apt. ", subscriber.getApartment(), "."));
    }

    private void setContacts(Subscriber subscriber, InputReader inputReader) {
        subscriber.setPhone(inputReader.promptUntilValidInput("phone"));
        subscriber.setMobileOne(inputReader.promptUntilValidInput("mobileOne"));
        subscriber.setMobileTwo(inputReader.promptUntilValidInput("mobileTwo"));
        subscriber.setEmail(inputReader.promptUntilValidInput("email"));
        subscriber.setSkype(inputReader.promptUntilValidInput("skype"));
    }

    private void setAdditionalInfo(Subscriber subscriber, InputReader inputReader) {
        subscriber.setNickname(inputReader.promptUntilValidInput("nickname"));
        subscriber.setComment(inputReader.promptUntilValidInput("comment"));
        subscriber.setGroup(Enum.valueOf(Group.class, inputReader.promptUntilValidInput("group")));
    }

    private void setPersonalInfo(Subscriber subscriber, InputReader inputReader) {
        subscriber.setLastName(inputReader.promptUntilValidInput("lastName"));
        subscriber.setFirstName(inputReader.promptUntilValidInput("firstName"));
        subscriber.setPatronymic(inputReader.promptUntilValidInput("patronymic"));
        subscriber.setFormattedName(subscriber.getLastName() + " " + subscriber.getFirstName().substring(0, 1) + ".");
    }

}
