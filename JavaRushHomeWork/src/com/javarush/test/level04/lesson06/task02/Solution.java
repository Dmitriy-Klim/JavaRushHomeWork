package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a>b)
            a=a;
        else
            a=b;
        if (a>c) {
            a=a;
        }
        else
            a=c;
        if (a>d) {
            a=a;
        }
        else
            a=d;
        System.out.print(a);



    }
}
