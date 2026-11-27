package ru.Shiakhmetov.birds;

import java.util.Random;

public class Parrot extends Bird{
    
    private String text;

    public Parrot(String text){
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException("Текст не может быть пустым");
        }

        this.text = text;
    }

    @Override 
    public void sing(){
        Random random = new Random();

        int count = random.nextInt(text.length()) + 1;

        System.out.println(text.substring(0, count));
    }

    @Override 
    public String toString(){
        return "Попугай";
    }
}
