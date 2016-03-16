package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //SOLVED: Ввод числе через Scanner
        Scanner in = new Scanner(System.in);
        int name = in.nextInt();

        if (name<0) {
            name = name+1;
            System.out.println(name);
        }
        if (name>0) {
            name = name*2;
            System.out.println(name);
        }


    }

}