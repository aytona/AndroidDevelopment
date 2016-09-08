package com.aytona;

public class Moon
{
    public static float ConvertWeight(float earthWeight)
    {
        float moonGravity = 0.17f;
        return earthWeight * moonGravity;
    }
}