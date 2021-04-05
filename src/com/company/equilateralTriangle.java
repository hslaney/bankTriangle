package com.company;

public class equilateralTriangle extends Triangle {

    private double side;

    public equilateralTriangle(double s){
        super(s);
        side = s;
    }

    public double getPerimeter(){
        return 3 * side;
    }

    public double getArea() {
        return Math.sqrt(3.0) / 4 * side * side;
    }

    public String toString(){
        return "An equilateral triangle with sides length " + side;
    }

}
