package ru.kovtunea.shapes;

public class Rectangle extends Shape {
    final private double a;
    final private double b;

    public Rectangle(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative side size is not allowed");
        }

        this.a = a;
        this.b = b;
    }

    @Override
    public double area() { return a * b; }
}
