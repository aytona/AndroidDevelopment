package com.aytona;

/**
 * Created by Aytona on 2016-09-20.
 */
public class TwoDShape
{
    private double width;
    private double height;

    public TwoDShape(double width, double height)
    {
        SetWidth(width);
        SetHeight(height);
    }

    public TwoDShape(double radius)
    {
        SetWidth(radius);
        SetHeight(radius);
    }

    public void SetWidth(double width)
    {
        this.width = width;
    }

    public void SetHeight(double height)
    {
        this.height = height;
    }

    public double GetWidth()
    {
        return this.width;
    }

    public double GetHeight()
    {
        return this.height;
    }

    void showDim()
    {
        System.out.println("Width: " + width + " Height: " + height);
    }
}

