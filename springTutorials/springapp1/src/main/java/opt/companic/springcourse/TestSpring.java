package opt.companic.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        MusicPlayer anotherMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer == anotherMusicPlayer);
        System.out.println(musicPlayer);
        System.out.println(anotherMusicPlayer);

        musicPlayer.setVolume(100);
        System.out.println(anotherMusicPlayer.getVolume());

        context.close();
    }
}
