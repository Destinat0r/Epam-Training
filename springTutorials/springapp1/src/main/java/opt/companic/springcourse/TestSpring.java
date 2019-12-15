package opt.companic.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("electronicMusic", Music.class);
//
//
        //        musicPlayer.playMusic();

        //        Computer computer = context.getBean("computer", Computer.class);
        //        System.out.println(computer.toString());

        //        System.out.println(musicPlayer.playMusic(Genre.CLASSICAL));
        //        System.out.println(musicPlayer.playMusic(Genre.ELECTRONIC));

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
