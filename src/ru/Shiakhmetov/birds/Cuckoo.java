package ru.Shiakhmetov.birds;

import java.util.Random;

public class Cuckoo extends Bird {
    
    @Override 
    public void sing(){
        Random random = new Random();
        int count = random.nextInt(10) + 1;

        for (int i = 0; i < count; i++){
            System.out.println("ку-ку");
        }
    }

    @Override 
    public String toString(){
        return "Кукушка";
    }
}
