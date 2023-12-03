package kg.add.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PhonkMusic  phonkMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic,
                       @Qualifier("phonkMusic") PhonkMusic  phonkMusic,
                       @Qualifier("rockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.phonkMusic = phonkMusic;
        this.rockMusic = rockMusic;
    }


    public void playMusic(Genre genre){
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);
        if(genre==Genre.CLASSICAL){
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if (genre==Genre.PHONK) {
            System.out.println(phonkMusic.getSongs().get(randomNumber));
        }else{
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}
