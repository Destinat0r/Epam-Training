package opt.companic.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ElectronicMusic implements Music {

    private String[] music = {"Emancipator - Eve", "Bloom - Zoto", "Eternal Youth - RUDE"};

    @Override public String getSong() {
        return "Playing Emancipator - Eve";
    }

    public String[] getMusic() {
        return music;
    }
}
