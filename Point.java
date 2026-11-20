package lab3;

public class Point {
    private int x;
    private int y;
    
    Point(){
        this.x = 0;
        this.y = 0;
    }

    Point(int x){
        this.x = x;
        this.y = 0;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Point point = (Point) obj;

        return this.x == point.getX() && this.y == point.getY();
    }
    
    @Override
    public String toString(){
        return String.format("{ %d; %d}", getX(), getY());; 
    }
}
