package ru.rmt.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("My initialization");
    }

    public void doMyDestroy() {
        System.out.println("Destruction");
    }

    @Override
    public List<String> getSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("Classical Music 1");
        songs.add("Classical Music 2");
        songs.add("Classical Music 3");
        return songs;
    }
}
