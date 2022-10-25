package ru.mirea.task11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task11_4 {
    public static void main(String[] args) {
        int year, month, day, hour, minute;
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

        Date date = new Date();
        date.setYear(year);
        date.setMonth(month);
        date.setDate(day);
        date.setHours(hour);
        date.setMinutes(minute);
        System.out.println(date);

        Calendar date1 = new GregorianCalendar();
        date1.set(Calendar.YEAR, year);
        date1.set(Calendar.MONTH, month);
        date1.set(Calendar.DAY_OF_MONTH, day);
        date1.set(Calendar.HOUR_OF_DAY, hour);
        date1.set(Calendar.MINUTE, minute);

        System.out.println("Календарь");
        System.out.println("Год: " + date1.get(Calendar.YEAR));
        System.out.println("Месяц: " + date1.get(Calendar.MONTH));
        System.out.println("День: " + date1.get(Calendar.DAY_OF_MONTH));
        System.out.println("Час: " + date1.get(Calendar.HOUR));
        System.out.println("Минута: " + date1.get(Calendar.MINUTE));
    }
}