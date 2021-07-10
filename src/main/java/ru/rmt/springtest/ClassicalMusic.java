package ru.rmt.springtest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{

    public void doMyInit() {
        System.out.println("My initialization");
    }

    public void doMyDestroy() {
        System.out.println("Destruction");
    }

    @Override
    public String getSongs() {
        return "Hungarian Rhapsody";
    }
}
