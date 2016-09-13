package com.aytona;

/**
 * Created by Aytona on 2016-09-13.
 */
public class Stack
{
    private char[] stackArray;

    Stack(int size)
    {
        stackArray = new char[size];
    }

    void push(char character)
    {
        for(int i = 0; i < stackArray.length; i++)
        {
            if (stackArray[i] == '\u0000')
            {
                stackArray[i] = character;
                return;
            }
        }
        char[] temp = stackArray;
        stackArray = new char[temp.length + 1];
        for (int i = 0; i < stackArray.length; i++)
        {
            if (i == temp.length)
            {
                stackArray[i] = character;
                break;
            }
            else
            {
                stackArray[i] = temp[i];
            }
        }
    }

    void pop()
    {
        char[] temp = stackArray;
        stackArray = new char[temp.length - 1];
        for (int i = 0; i < stackArray.length; i++)
        {
            stackArray[i] = temp[i];
        }
    }

    String showStack()
    {
        String output = "";
        for (int i = 0; i < stackArray.length; i++)
        {
            output += stackArray[i];
        }
        return output;
    }
}
