package ru.mirea.task3;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        System.out.print("Введите радиус окружности: ");
        Scanner rad = new Scanner(System.in);
        String r = rad.nextLine();
        float radius = Integer.parseInt(r);
        Circle krug = new Circle(radius);
        krug.Change(radius);
    }
}
