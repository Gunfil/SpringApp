package ru.rmt.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1, music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicType type) {
        Random r = new Random();
        List<String> list;
        if (type == MusicType.CLASSICAL) {
            list = music1.getSongs();
            return "Playing: " + list.get(r.nextInt(3));
        } else {
            list = music2.getSongs();
            return "Playing: " + list.get(r.nextInt(3));
        }
    }
}
