package ru.mirea.task6.t11;

public class Farengeit implements Convertable {
    @Override
    public double convert(double measure) {
        return measure * 1.8 + 32;
    }
}
