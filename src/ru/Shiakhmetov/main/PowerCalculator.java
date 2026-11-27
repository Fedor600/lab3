package ru.Shiakhmetov.main;

import java.lang.Integer;
import java.lang.Math;

public class PowerCalculator {
    private String[] args;

    public PowerCalculator(String[] args){
        this.args = args;
    }

    public double calculate(){
        if (args.length < 2){
            throw new IllegalArgumentException("Передайте два числа в аргументах запуска программы.");
        }
        return power(args[0], args[1]);
    }

    public static double power(String x, String y){
        return Math.pow(Integer.parseInt(x), Integer.parseInt(y));
    }
}
