package com.company;

public class Cylinder {
    private double base;
    private double height;
    private double h;
    private double r;
    private Circle c1;

    public Cylinder(double height, double radius) {
        h = height;
        r = radius;
        c1 = new Circle(r);
    }

    public double vol() {
        double v = Math.PI * Math.pow(r, 2) * h;
        return v;
    }

    public double sa() {
        double s = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
        return s;
    }
}