package lab3;

public abstract class Bird implements Singable{

    public abstract void sing();

    @Override 
    public String toString(){
        return "Птица";
    }
}
