package view;

public interface FieldMessages {
    String firstName = "Please, enter your first name (1-50 characters)";
    String patronymic = "Please, enter your patronymic name if any (1-50 characters), else press 'Enter'.";
    String lastName = "Please, enter your last name (1-50 characters).";

    String nickname = "Please, enter your nickname (1-20 characters).";
    String comment = "If you like, enter a comment (1-50 characters), or press 'Enter'.";

    String homePhone = "Please, enter your city phone number you could be contacted with (use pattern +38044...), "
                               + "if none press 'Enter'.";
    String mobileOne = "Please, enter your mobile phone number (use pattern +380... ).";
    String mobileTwo = "If you like, enter second mobile phone number (use pattern +380... ), else press 'Enter'.";
    String email = "Please, enter your email.";
    String skype = "Enter your skype account name, or press 'Enter'.";

    String index = "Please, enter your address.\nPlease, enter index (5 digits).";
    String city = "Please, enter city name.";
    String street = "Please, enter street name.";
    String building = "Please, enter building number.";
    String apartment = "Please, enter apartment number.";

    String invalidInput = "INVALID INPUT!";

    String[] messages = {lastName, firstName, patronymic, nickname, comment, homePhone, mobileOne, mobileTwo, email,
            skype, index, city, street, building, apartment};

    //    String created;
//    String modified;

}
