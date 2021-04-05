package com.company;
// Chapter 11 Question 8

public abstract class Triangle
{
    private double side;

    public Triangle(double side)
    {
        this.side = side;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public double getRatio()
    {
        return getArea()/getPerimeter();
    }


}



