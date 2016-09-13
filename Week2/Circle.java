package com.aytona;

/**
 * Created by Aytona on 2016-09-13.
 */
public class Circle
{
    float xPosition;
    float yPosition;
    float radius;

    Circle(float radius)
    {
        this.radius = radius;
    }
    Circle(float xPos, float yPos, float radius)
    {
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.radius = radius;
    }
    void displayPosition()
    {
        System.out.println("The cirlce is positioned at (" + xPosition + ", " + yPosition + ")");
    }
    float getArea()
    {
        return 3.14f * radius * radius;
    }
}
