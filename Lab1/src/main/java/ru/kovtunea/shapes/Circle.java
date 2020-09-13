package ru.kovtunea.shapes;

public class Circle extends Shape {
    final private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius is not allowed");
        }

        this.radius = radius;
    }

    @Override
    public double area() { return Math.PI * radius * radius; }
}
