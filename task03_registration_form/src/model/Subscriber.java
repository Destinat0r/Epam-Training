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
    private Enum group;

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

    public Subscriber() {

    }
    
    public void init() {

    }

    private void setDates() {
        created = LocalDateTime.now();
        modified = LocalDateTime.now();
    }

    @Override public String toString() {
        return "Subscriber{" + "lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", patronymic='"
                       + patronymic + '\'' + ", formattedName='" + formattedName + '\'' + ", nickname='" + nickname
                       + '\'' + ", comment='" + comment + '\'' + ", group='" + group + '\'' + ", phone='" + phone + '\''
                       + ", mobileOne='" + mobileOne + '\'' + ", mobileTwo='" + mobileTwo + '\'' + ", email='" + email
                       + '\'' + ", skype='" + skype + '\'' + ", index='" + index + '\'' + ", city='" + city + '\''
                       + ", street='" + street + '\'' + ", building='" + building + '\'' + ", apartment='" + apartment
                       + '\'' + ", fullAddress='" + fullAddress + '\'' + ", created=" + created + ", modified="
                       + modified + '}';
    }
}
