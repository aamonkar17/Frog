//Ankit Amonkar
//Line
package com.company;

public class Line {
    private Point end1;
    private Point end2;

    public Line(double x1, double y1, double x2, double y2)
    {
        end1 = new Point(x1,y1);
        end2 = new Point(x2,y2);

    }
    public Line()		// default constructor
    {
        end1 = new Point();
        end2 = new Point();
    }

    public double distance()
    {
        double distance1 = Math.sqrt(Math.pow(end2.getX() - end1.getX(), 2) + Math.pow(end2.getY() - end1.getY(), 2));   //finds the distance of a line
        return distance1;
        //You may find Math.pow(base, power) and Math.sqrt(num) useful
    }

    public Point midpoint()
    {
        double x4 = ((end1.getX() + end2.getX()) * 0.5);    //Averages the two x values of end1 and end2
        double y4 = ((end1.getY() + end2.getY()) * 0.5);    //Averages the two y values of end1 and end2
        Point end4 = new Point(x4, y4);
        return end4;
    }

    public boolean sameLength(Line otherLine)
    {
        double d1 = this.distance();
        double d2 = otherLine.distance();
        return Math.abs(d1-d2) <= .001;
    }

    public double slope()
    {
        double m;
        m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
        return m;

    }
    public String toString()
    {
        String s = "Line with endpoints " + end1 + " and " + end2;
        return s;
    }

    public boolean parallel(Line otherLine)
    {
        double m1 = this.slope();
        double m2 = otherLine.slope();

        //return m1==m2;
        //because of roundoff error, it is not recommended that you compare
        //two floats for equality, but that their difference is small
        return Math.abs(m1-m2)<=.0001;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Line l1 = new Line(-1,-3, 2,1);

        double m = l1.slope();
        System.out.println(l1);
        System.out.println("Slope = " + m);

        Line l2 = new Line(0,0,3,4);
        System.out.println(l2);
        System.out.println("Slope = " + l2.slope());
        System.out.println("Parallel? " + l1.parallel(l2));


        double dist = l1.distance();
        Point p1 = l1.midpoint();


        System.out.println("distance = " + dist);
        System.out.println("Midpoint = " + p1);


        System.out.println("distance = " + l2.distance());
        System.out.println("Same length? " + l1.sameLength(l2));

    }

}

/* Output
Line with endpoints (-1.0, -3.0) and (2.0, 1.0)
Slope = 1.3333333333333333
Line with endpoints (0.0, 0.0) and (3.0, 4.0)
Slope = 1.3333333333333333
Parallel? true
distance = 5.0
Midpoint = (0.5, -1.0)
distance = 5.0
Same length? true
 */