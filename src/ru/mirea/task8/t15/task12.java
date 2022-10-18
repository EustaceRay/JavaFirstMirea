package ru.mirea.task8.t15;

import java.util.Scanner;

public class task12 {
    public static void RecNow(int x){
        System.out.print(x % 10 + " ");
        if (x >=10)
            RecNow(x / 10);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RecNow(n);
    }
}
