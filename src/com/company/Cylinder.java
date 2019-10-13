package com.company;

public class CylinderTest {
    private double base;
    private double height;
    private double h;
    private double r;

    public CylinderTest(double height, double radius) {
        h = height;
        r = radius;
        double c1 = new Circle(r);
        c1 *= h;
    }

    public double vol() {
        double v = Math.PI * Math.pow(r, 2) * h;
        return v;
    }

    public double sa() {
        double s = 2 * Math.PI * r * h + 2 * Math.PI * Math.pow (r, 2);
        return s;
    }

    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(5,2);
            double vol = cyl.vol();
            System.out.println("radius = 5 height = 2 volume = " + vol);
            double sa = cyl.sa();
            System.out.println("surface area = " + sa);

            Cylinder cyl2 = new Cylinder(8,6);
            vol = cyl2.vol();
            System.out.println("radius = 8 height = 6 volume = " + vol);
            sa = cyl2.sa();
            System.out.println("surface area = " + sa);
        }
    }
}
