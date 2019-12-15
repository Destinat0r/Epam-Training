package opt.companic.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("electronicMusic") Music music1,
                        @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        Random random = new Random();
        if (genre == Genre.CLASSICAL) {
            return "Playing: " + ((ElectronicMusic) music1).getMusic()[random.nextInt(3)];
        }
        return "Playing: " + ((ClassicalMusic) music2).getMusic()[random.nextInt(3)];
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
