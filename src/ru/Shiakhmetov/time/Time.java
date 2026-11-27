package ru.Shiakhmetov.time;

public class Time {
    private long seconds;

    public Time(long seconds){
        setSecondTime(seconds);
    }

    public void setSecondTime(long seconds){
        if (seconds < 0){
            throw new IllegalArgumentException("Время не может быть отрицательным!");

        }

        this.seconds = seconds %  86400;
    }

    public long getSecondTime(){
        return this.seconds;
    }

    @Override 
    public String toString(){
        long hours = seconds / 3600;
        long minutes = seconds % 3600 / 60;
        long secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}
