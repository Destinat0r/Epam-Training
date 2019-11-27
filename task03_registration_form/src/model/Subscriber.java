package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Subscriber {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String formattedName;

    private String nickname;
    private String comment;

    private String phone;
    private String mobileOne;
    private String mobileTwo;
    private String email;
    private String skype;

    private String index;
    private String city;
    private String street;
    private String building;
    private String apartment;
    private String fullAddress;

    private LocalDateTime created;
    private LocalDateTime modified;

    private ArrayList<String> allSubscriberInfo;

    public Subscriber() {
        this.allSubscriberInfo = new ArrayList<>();
    }

    public ArrayList<String> getAllSubscriberInfo() {
        return allSubscriberInfo;
    }

    public void setAllSubscriberInfo(ArrayList<String> allSubscriberInfo) {
        this.allSubscriberInfo = allSubscriberInfo;
    }

    public void init() {
        int counter = 0;
        counter = setPersonalInfo(counter);
        counter = setAdditionalInfo(counter);
        counter = setContacts(counter);
        setAddress(counter);
        setDates();
    }


    private int setPersonalInfo(int counter) {
        lastName = allSubscriberInfo.get(counter++);
        firstName = allSubscriberInfo.get(counter++);
        patronymic = allSubscriberInfo.get(counter++);
        formattedName = lastName + " " + firstName.substring(0, 1) + ".";
        return counter;
    }

    private int setAdditionalInfo(int counter) {
        nickname = allSubscriberInfo.get(counter++);
        comment = allSubscriberInfo.get(counter++);
        return counter;
    }

    private int setContacts(int counter) {
        phone = allSubscriberInfo.get(counter++);
        mobileOne = allSubscriberInfo.get(counter++);
        mobileTwo = allSubscriberInfo.get(counter++);
        email = allSubscriberInfo.get(counter++);
        skype = allSubscriberInfo.get(counter++);
        return  counter;
    }

    private int setAddress(int counter) {
        index = allSubscriberInfo.get(counter++);
        city = allSubscriberInfo.get(counter++);
        street = allSubscriberInfo.get(counter++);
        building = allSubscriberInfo.get(counter++);
        apartment = allSubscriberInfo.get(counter++);
        fullAddress = index + ", " + city + ", " + street + ", " + building + ", apt. " + apartment;
        return counter;
    }

    private void setDates() {
        created = LocalDateTime.now();
        modified = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Subscriber{" + "lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", patronymic='"
                       + patronymic + '\'' + ", formattedName='" + formattedName + '\'' + ", nickname='" + nickname
                       + '\'' + ", comment='" + comment + '\'' + ", phone='" + phone + '\'' + ", mobileOne='"
                       + mobileOne + '\'' + ", mobileTwo='" + mobileTwo + '\'' + ", skype='" + skype + '\''
                       + ", index='" + index + '\'' + ", city='" + city + '\'' + ", street='" + street + '\''
                       + ", building='" + building + '\'' + ", apartment='" + apartment + '\'' + ", fullAddress='"
                       + fullAddress + '\'' + ", created=" + created + ", modified=" + modified + '}';
    }
}
