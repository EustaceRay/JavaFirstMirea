package ru.mirea.task3;

public class Circle {
    float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    public void Change(float radius) {
        float S = (float) ((3.14) * radius * radius);
        float V = (float) ((4/3) *3.14*radius*radius*radius);
        System.out.println("Площадь окружности: " + S);
        System.out.print("Объём окружности: " + V);
    }
}
