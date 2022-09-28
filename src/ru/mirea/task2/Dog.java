package ru.mirea.task2;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void toString(String name, int age){
        Dog dogs = new Dog(name, age);
        System.out.println("Имя - " + dogs.name);
        System.out.println("Возраст - " + dogs.age + "( " + dogs.age * 7 +" в человеческих годах )");
    }
}
