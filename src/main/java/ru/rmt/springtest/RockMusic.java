package ru.rmt.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {


    @Override
    public List<String> getSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("Rock Music 1");
        songs.add("Rock Music 2");
        songs.add("Rock Music 3");
        return songs;
    }
}
