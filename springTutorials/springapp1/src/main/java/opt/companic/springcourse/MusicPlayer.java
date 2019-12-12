package opt.companic.springcourse;

public class MusicPlayer {
    private Music music;
    private int volume;
    private String name;

    public MusicPlayer() {

    }

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.printf("Playing %s on volume %d\n", music.getSong(), volume);
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
}
