package ru.mirea.task2;

public class Shape {
    String shape;
    int length;

    public Shape(String shape, int length){
        this.shape = shape;
        this.length = length;
    }
    public void toString(String shape, int length){
        Shape square = new Shape("квадрат", 5);
        System.out.println("Фигура - " + square.shape);
        System.out.println("Длинна грани - " + square.length);
    }

}

