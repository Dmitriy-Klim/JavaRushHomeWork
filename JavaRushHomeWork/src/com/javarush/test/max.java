package com.javarush.test;

/**
 * Created by Admin on 10.03.2016.
 */
public class max
{
    public static int min(int a, int b, int c)
    {
        int m1=0;
        if (a>b)
            m1=a;
        else
            m1=b;
        if (m1>c)
            return m1;
        else
            m1=c;
        return m1;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }
}
