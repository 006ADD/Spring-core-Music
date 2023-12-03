package kg.add.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PhonkMusic implements Music{
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Dream Space");
        songs.add("METAMORPHOSIS");
        songs.add("Rupture");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
