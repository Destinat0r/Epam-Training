package opt.companic.springcourse;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> playList;

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }

    public void playMusic() {
        Random random = new Random();
        String song = playList.get(random.nextInt(playList.size())).getSong();
        System.out.println(song);
    }

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }
}
