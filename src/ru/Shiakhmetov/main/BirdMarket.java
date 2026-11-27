package ru.Shiakhmetov.main;

import ru.Shiakhmetov.birds.Bird;

public class BirdMarket {
    public static void birdMarket(Bird... birds){
        for(Bird bird: birds){
            bird.sing();
        }
    }
}
