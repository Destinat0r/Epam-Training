package controller;

public interface Regex {


    String name = "^[а-яА-ЯёЁa-zA-Z]+$";
    String lastName = name;
    String firstName = name;
    String patronymic = "^([а-яА-ЯёЁa-zA-Z]+)?$";
    String nickname = "^[a-zA-Z][a-zA-Z0-9]*$";
    String comment = "^[а-яА-ЯёЁa-zA-Z0-9\\s]{0,50}$";
    String homePhone = "^(\\+38044\\d{7})?$";
    String mobileOne = "\\+380(66|50|95|63|73|93|96|97|68)\\d{7}";
    String mobileTwo = "^(\\+380(66|50|95|63|73|93|96|97|68)\\d{7})?$";
    String email = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
                           + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

    String skype = "^([a-zA-Z][a-zA-Z0-9]{5,31})?$";
    String index = "\\d{5}";
    String city = "[a-zA-Zа-яА-ЯёЁ]{3,}";
    String street = "^[а-яА-ЯёЁa-zA-Z\\s]+$";
    String building = "\\d{1,3}[а-яА-ЯёЁa-zA-Z]?";
    String apartment = "\\d{1,3}";


    String[] patterns = {lastName, firstName, patronymic, nickname, comment, homePhone, mobileOne, mobileTwo, email,
                            skype, index, city, street, building, apartment};

}
