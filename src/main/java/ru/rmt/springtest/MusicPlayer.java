package ru.rmt.springtest;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random r = new Random();
        return musicList.get(r.nextInt(musicList.size())).getSongs();
    }
}
