package com.company;

public class equilateralTriangle extends Triangle {

    public equilateralTriangle(double s){
        super(s);
    }

    public double getPerimeter(){
        return 3 * getSide();
    }

    public double getArea() {
        return Math.sqrt(3.0) / 4 * getSide() * getSide();
    }

    public String toString(){
        return "An equilateral triangle with sides length " + getSide();
    }

}
