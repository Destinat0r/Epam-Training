package opt.companic.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private String[] music = {"Bethoven - 6th Symphony", "Vivaldi - Seassons", "Mozart - Requiem"};

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override public String getSong() {
        return "Hungarian Rhapsody";
    }

    public String[] getMusic() {
        return music;
    }
}
