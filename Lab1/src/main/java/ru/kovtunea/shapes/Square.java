package ru.kovtunea.shapes;

public class Square extends Shape {
    final private double a;

    public Square(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Negative side size is not allowed");
        }
        this.a = a;
    }

    @Override
    public double area() { return a * a; }
}
