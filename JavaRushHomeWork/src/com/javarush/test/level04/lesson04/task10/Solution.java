package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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

        if ((a==b)&&(a==c)&&(c==b))
            System.out.println(a+" "+b+" "+c);
        else if ((a==b)&&(c!=a)&&(c!=b))
            System.out.println(a+" "+b);
        else if ((a==c)&&(b!=a)&&(b!=c))
            System.out.println(a+" "+c);
        else if ((b==c)&&(a!=c)&&(a!=b))
            System.out.println(b+" "+c);


    }
}