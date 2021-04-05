package com.company;

public class rightTriangle extends Triangle {

    private double side;

    public rightTriangle(double s){
        super(s);
        side = s;
    }

    public double getPerimeter(){
        return (2 + Math.sqrt(2.0)) * side;
    }

    public double getArea() {
        return side * side / 2;
    }

    public String toString(){
        return "A right triangle with legs length " + side;
    }

}
