package com.aytona;

/**
 * Created by Aytona on 2016-09-20.
 */
public class Circle extends TwoDShape implements Enclosure
{
    public Circle(double radius)
    {
        super(radius);
    }

    @Override
    public double area()
    {
        return Math.PI * (GetWidth() / 2) * (GetWidth() / 2);   // A = PI * r ^ 2
    }

    @Override
    public double perimeter()
    {
        return Math.PI * GetWidth();
    }
}
