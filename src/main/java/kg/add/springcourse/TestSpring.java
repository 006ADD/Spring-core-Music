package kg.add.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

            musicPlayer.playMusic(Genre.CLASSICAL);
            musicPlayer.playMusic(Genre.PHONK);
            musicPlayer.playMusic(Genre.ROCK);
        }
    }
}
