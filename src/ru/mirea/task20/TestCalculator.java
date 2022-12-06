package ru.mirea.task20;

public class TestCalculator {
    public static void main(String[] args) {
        Integer o1 = 24;
        Long o2 = 237L;

        System.out.println("Числа: " + o1 + " и " + o2);
        System.out.println("Сумма: " + Calculator.sum(o1, o2));
        System.out.println("Произведение: " + Calculator.multiply(o1, o2));
        System.out.println("Частное: " + Calculator.divide(o1, o2));
        System.out.println("Разность: " + Calculator.subtraction(o1, o2));
    }
}