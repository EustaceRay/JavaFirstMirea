package ru.mirea.task6.t11;

public class Kelvin implements Convertable{
    @Override
    public double convert(double measure) {
        return measure + 273.15;
    }
}
