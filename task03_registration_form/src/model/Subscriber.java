package model;

import java.time.LocalDateTime;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Enum getGroup() {
        return group;
    }

    public void setGroup(Enum group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobileOne() {
        return mobileOne;
    }

    public void setMobileOne(String mobileOne) {
        this.mobileOne = mobileOne;
    }

    public String getMobileTwo() {
        return mobileTwo;
    }

    public void setMobileTwo(String mobileTwo) {
        this.mobileTwo = mobileTwo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public void setDates() {
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
