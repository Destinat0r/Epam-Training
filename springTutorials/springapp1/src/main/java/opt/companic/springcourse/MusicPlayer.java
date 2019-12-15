package opt.companic.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("electronicMusic")
    private Music music1;

    public String playMusic() {
        return "Playing " + music1.getSong();
    }
}
