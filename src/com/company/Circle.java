//Ankit Amonkar
//Circle
package com.company;

public class Circle {
    private double radius;
    private Circle c1;

    public Circle(double r){   //constructor
        radius = r;
    }

    public Circle () {    //default constructor
        radius = 1;
    }

    public double area(){  //method to find area of circle
        double a = Math.PI * Math.pow(radius, 2);
        return a;
    }

    public double circumference(){  //method to find circumference of circle
        double c = 2 * Math.PI * radius;
        return c;
    }
}
