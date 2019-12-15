package opt.companic.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public ElectronicMusic electronicMusic() {
        return new ElectronicMusic();
    }

    @Bean
    public AcousticGuitarMusic acousticGuitarMusic() {
        return new AcousticGuitarMusic();
    }

    @Bean
    public List<Music> playlist() {
        List<Music> playlist = new ArrayList<>();
        playlist.add(classicalMusic());
        playlist.add(electronicMusic());
        playlist.add(acousticGuitarMusic());
        return playlist;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(playlist());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
