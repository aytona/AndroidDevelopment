package com.aytona;

/**
 * Created by Aytona on 2016-09-13.
 */
public class Bug
{
    int position;
    int direction = 1;

    Bug(int initPosition)
    {
        position = initPosition;
    }
    void turn()
    {
        direction *= -1;
    }
    void move()
    {
        position += direction;
    }
    int getPosition()
    {
        return position;
    }
}
