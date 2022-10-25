package ru.mirea.task11;

import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task11_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("ArrayList test");
        testList(arrayList);
        System.out.println();
        System.out.println("LinkedList test");
        testList(linkedList);

    }

    public static void testList(List<Integer> list) {
        float Num = 60;

        double estimatedTime = 0;
        for (int i = 0; i < Num; i++) {
            estimatedTime += testAdd(list) / Num;
        }
        System.out.println("ADD: " + estimatedTime + " ms");

        estimatedTime = 0;
        for (int i = 0; i < Num; i++) {
            estimatedTime += testInsert(list) / Num;
        }
        System.out.println("INSERT: " + estimatedTime + " ms");

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        estimatedTime = 0;
        for (int i = 0; i < Num; i++) {
            estimatedTime += testGet(list) / Num;
        }
        System.out.println("GET: " + estimatedTime + " ms");

        list.clear();
        estimatedTime = 0;
        for (int i = 0; i < Num; i++) {
            for (int j = 0; j < 10000; j++) {
                list.add(j);
            }
            estimatedTime += testRemove(list) / Num;
        }
        System.out.println("REMOVE: " + estimatedTime + " ms");
    }

    public static long testAdd(List<Integer> list) {
        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        Date finish = new Date();
        long time = finish.getTime() - start.getTime();
        list.clear();
        return time;
    }

    public static long testInsert(List<Integer> list) {
        Random random = new Random();
        int size = list.size();
        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(size + 1), i);
        }
        Date finish = new Date();
        long time = finish.getTime() - start.getTime();
        list.clear();
        return time;
    }

    public static long testGet(List<Integer> list) {
        Random random = new Random();
        int size = list.size();
        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            list.get(random.nextInt(size));
        }
        Date finish = new Date();
        long time = finish.getTime() - start.getTime();
        return time;
    }

    public static long testRemove(List<Integer> list) {
        Random random = new Random();
        int size = list.size();
        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            list.remove(random.nextInt(size--));
        }
        Date finish = new Date();
        long time = finish.getTime() - start.getTime();
        return time;
    }

}