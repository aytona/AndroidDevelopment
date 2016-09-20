package com.aytona;

/**
 * Created by Aytona on 2016-09-20.
 */
public class Square extends TwoDShape implements Enclosure
{
    public Square(double width)
    {
        super(width);
    }

    @Override
    public double perimeter()
    {
        return 4 * GetWidth();
    }

    @Override
    public double area()
    {
        return GetWidth() * GetWidth();
    }
}
