package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

public class MainTask1 {
    public static int Factorial(int y) {
        if (y <= 1) {
            return 1;
        }
        else {
            return y * Factorial(y - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Задание 3:");
        int n = 0;
        int[] mass = {1, 4, 6, 7, 8, 9, 4};
        for (int i = 0; i < mass.length; i++) {
            n = n + mass[i];
        }
        System.out.println(n);

        int b = 0;
        int j = 0;
        int[] mass2 = {2, 4, 24, 7, 23, 56, 6};
        while (j < 7) {
            b = b + mass2[j];
            j++;
        }
        System.out.println(b);

        int[] mass3 = {24, 42, 15, 19, 75, 33, 52, 67};
        int c = 0;
        int k = 0;
        do {
            c = c + mass3[k];
            k++;
        } while (k < 8);
        System.out.println(c);

        System.out.println("Задание 4:");
        for (int f = 0; f < args.length; f++) {
            System.out.println(args[f]);
        }

        System.out.println("Задание 5:");
        for (int v = 1; v < 11; v++) {
            System.out.println(1./v);
        }

        System.out.println("Задание 6:");
        System.out.println("Использование Math.random():");
        int[] arr = new int[10];
        for(int g = 0; g < arr.length; g++){
            arr[g] = (int)(Math.random()*100);
            System.out.print(arr[g] + " ");
        }
        System.out.println();
        for(int p = arr.length - 1; p > 0; p--) {
            for (int l = 0; l < p; l++) {
                if (arr[l] < arr[l + 1]) {
                    int tmp = arr[l];
                    arr[l] = arr[l + 1];
                    arr[l + 1] = tmp;
                }
            }
        }
        for (int s = arr.length - 1; s >= 0; s--) {
            System.out.print(arr[s] + " ");
        }
        System.out.println();
        System.out.println("Использование Random:");
        java.util.Random random = new java.util.Random();
        int[] array = new int [10];
        for(int z = 0; z < array.length; z++){
            array[z] = random.nextInt(100);
            System.out.print(array[z] + " ");
        }
        System.out.println();
        for(int a = array.length-1; a > 0; a--) {
            for (int m = 0; m < a; m++) {
                if (array[m] < array[m + 1]) {
                    int tmpp = array[m];
                    array[m] = array[m + 1];
                    array[m + 1] = tmpp;
                }
            }
        }
        for (int t = array.length - 1; t >= 0; t--) {
            System.out.print(array[t] + " ");
        }
        System.out.println();
        System.out.println("Задание 7:");
        System.out.print("Введите ваше число для поиска факториала: ");
        Scanner scan = new Scanner(System.in);
        int Number = scan.nextInt();
        System.out.println(Factorial(Number));
    }
}