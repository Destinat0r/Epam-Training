package opt.companic.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private int volume;
    private String name;

    public MusicPlayer() {

    }

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return music.getSong();
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Music getMusic() {
        return music;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
