package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int m = Integer.parseInt(a1);  //входная переменная 4
        int n = Integer.parseInt(b1);   //входная переменная 2
        String w = "";
        int c;
        int d;
        for (c = 0;c < n; c++)   {
            w = w + "8";
            if (c == n-1){
                for(d = 0; d < m; d++){
                    System.out.println(w);
                }
            }
        }
    }
}
