package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    private ResourceBundle messagesBundle;

    public View() {
        messagesBundle = ResourceBundle.getBundle("messages", new Locale("en"));
    }

    public void printMessage(String message) {
        System.out.println(messagesBundle.getString(message));
    }

    public String concat(String ...strings) {
        StringBuilder builder = new StringBuilder();

        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public ResourceBundle getMessagesBundle() {
        return messagesBundle;
    }

    public void setLocale(ResourceBundle messagesBundle) {
        this.messagesBundle = messagesBundle;
    }
}
