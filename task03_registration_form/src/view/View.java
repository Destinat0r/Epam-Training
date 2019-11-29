package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    private ResourceManager resourceManager;

    public View() {
        resourceManager = ResourceManager.INSTANCE;
    }

    public void printMessage(String message) {
        System.out.println(resourceManager.getString(message));
    }

    public String concat(String ...strings) {
        StringBuilder builder = new StringBuilder();

        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public void setLocale(Locale locale) {
        resourceManager.changeResource(locale);
    }
}
