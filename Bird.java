package lab3;

public abstract class Bird {
    String voice;
    String name;

    public String getName(){
        return name;
    }

    public abstract String listenVoice();
}
