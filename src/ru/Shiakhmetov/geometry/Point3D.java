package ru.Shiakhmetov.geometry;

public class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ(){
        return this.z;
    }

    @Override
    public String toString(){
        return String.format("{ %d; %d; %d}", getX(), getY(), getZ());
    }

}
