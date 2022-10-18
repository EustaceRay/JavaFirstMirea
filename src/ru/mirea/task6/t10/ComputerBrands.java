package ru.mirea.task6.t10;

public enum ComputerBrands {
    SONY,
    INTEL,
    APPLE,
    LINUX;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}