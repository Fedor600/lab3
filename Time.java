package lab3;

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
}
