package opt.companic.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
//    private Music music;

    private ClassicalMusic classicalMusic;
    private ElectronicMusic electronicMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, ElectronicMusic electronicMusic) {
        this.classicalMusic = classicalMusic;
        this.electronicMusic = electronicMusic;
    }
    //    @Autowired

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        System.out.println("Playing " + classicalMusic.getSong());
        System.out.println("Playing " + electronicMusic.getSong());
    }

    public ClassicalMusic getClassicalMusic() {
        return classicalMusic;
    }

    public ElectronicMusic getElectronicMusic() {
        return electronicMusic;
    }
}
