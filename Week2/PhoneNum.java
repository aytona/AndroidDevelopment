package com.aytona;

/**
 * Created by Aytona on 2016-09-13.
 */
public class PhoneNum
{
    String number;

    PhoneNum() { }
    PhoneNum(String number)
    {
        String area = number.substring(0, 3);
        String prefix = number.substring(3, 6);
        String postfix = number.substring(6, 10);

        this.number = "(" + area + ")" + prefix + "-" + postfix;
    }

    String showNum()
    {
        return number;
    }
}
