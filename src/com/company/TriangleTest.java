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
            System.out.println("Area = " + t.getArea());
            System.out.println("Perimeter = " + t.getPerimeter());
            System.out.println("Ratio = " + t.getRatio());
        }

    }

}
/*
A right triangle with legs length 4.0
Area = 8.0
Perimeter = 13.65685424949238
Ratio = 0.585786437626905
A right triangle with legs length 6.0
Area = 18.0
Perimeter = 20.485281374238568
Ratio = 0.8786796564403575
An equilateral triangle with sides length 4.0
Area = 6.928203230275509
Perimeter = 12.0
Ratio = 0.5773502691896257
An equilateral triangle with sides length 6.0
Area = 15.588457268119896
Perimeter = 18.0
Ratio = 0.8660254037844387
 */