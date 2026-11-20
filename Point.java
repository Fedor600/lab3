package lab3;

public class Point {
    int x;
    int y;
    int z;

    Point(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    Point(int x){
        this.x = x;
        this.y = 0;
        this.z = 0;

    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

    public String coordinates(){
        String crdn = String.format("{ %d; %d; %d}", getX(), getY(), getZ());
        return crdn; 
    }
}
