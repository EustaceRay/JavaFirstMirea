package ru.mirea.task20;

public class TestGenericClass {
    public static void main(String[] args) {
        Integer obj1 = 4;
        Animal dog = new Animal("Барсик", 2);
        double[] array = new double[]{532.12, 0.36, 65.0};
        GenericClass genericClass = new GenericClass(obj1, dog, array);

        genericClass.printAllVars();
    }
}