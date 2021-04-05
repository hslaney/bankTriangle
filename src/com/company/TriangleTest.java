package com.company;

public class TriangleTest {

    public static void main (String[] args){
        Triangle [] t1 = new Triangle[4];

        rightTriangle r1 = new rightTriangle(4.0);
        rightTriangle r2 = new rightTriangle(6.0);
        equilateralTriangle e1 = new equilateralTriangle(4.0);
        equilateralTriangle e2 = new equilateralTriangle(6.0);

        t1[0] = r1;
        t1[1] = r2;
        t1[2] = e1;
        t1[3] = e2;

        for(Triangle t: t1){
            System.out.println(t);
            // no tostring?
            System.out.println("Area = " + t.getArea());
            System.out.println("Perimeter = " + t.getPerimeter());
            System.out.println("Ratio = " + t.getRatio());
        }

    }

}
