package ru.mirea.task6.t11;
import java.util.Scanner;

public class task6_11main {
    public static void main(String[] args) {
        Farengeit Far = new Farengeit();
        Kelvin Kel = new Kelvin();
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        Scanner sc = new Scanner(System.in);
        double cels = sc.nextDouble();
        System.out.println("Температура в градусах Фаренгейта: " + Far.convert(cels));
        System.out.println("Температура в градусах Кельвина: " + Kel.convert(cels));
    }
}
