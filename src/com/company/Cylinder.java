//Ankit Amonkar
//Cylinder
package com.company;

public class Cylinder {
    private double base;
    private double height;
    private double h;
    private double r;
    private Circle c1;

    public Cylinder(double radius, double height) {
        h = height;
        r = radius;
        c1 = new Circle(r);
    }

    public double vol() {
        double v = c1.area() * h;
        return v;
    }

    public double sa() {
        double s = ((c1.circumference() * h) + 2*c1.area());
        return s;
    }
}