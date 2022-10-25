package ru.mirea.task11;

import java.util.Date;
import java.util.Scanner;

public class task11_2 {
    public static void main(String[] args) {
        Date date = new Date();
        Date sysTime = new Date(System.currentTimeMillis());

        int year, month, day, hour, minute, second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Год: ");
        year = sc.nextInt();
        System.out.print("Месяц: ");
        month = sc.nextInt();
        System.out.print("День: " );
        day = sc.nextInt();
        System.out.print("Час: ");
        hour = sc.nextInt();
        System.out.print("Минута: ");
        minute = sc.nextInt();
        System.out.print("Секунда: ");
        second = sc.nextInt();

        Date userDate = new Date();
        userDate.setYear(year);
        userDate.setMonth(month);
        userDate.setDate(day);
        userDate.setHours(hour);
        userDate.setMinutes(minute);
        userDate.setSeconds(second);

        if (date.compareTo(sysTime) > 0) {
            System.out.println("Текущая дата больше системного времени");
        } else if (date.compareTo(sysTime) < 0) {
            System.out.println("Текущая дата меньше системного времени");
        } else {
            System.out.println("Текущая дата равно системноу времени");
        }

        if (userDate.compareTo(sysTime) > 0) {
            System.out.println("Время пользователя больше системного времени");
        } else if (date.compareTo(sysTime) < 0) {
            System.out.println("Время пользователя меньше системного времени");
        } else {
            System.out.println("Время пользователя равно системному времени");
        }
    }
}