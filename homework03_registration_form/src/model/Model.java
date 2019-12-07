package model;

public class Model {
    private Subscriber subscriber;

    public Model() {
        this.subscriber = new Subscriber();
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }
}
