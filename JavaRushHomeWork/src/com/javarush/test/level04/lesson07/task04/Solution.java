package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader av=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(av.readLine());
        int b=Integer.parseInt(av.readLine());
        int c=Integer.parseInt(av.readLine());
        if (a>=0&&b>=0&&c>=0)
            System.out.println("количество отрицательных чисел: 0\nколичество положительных чисел: 3");
        else if ((a<0&&b>=0&&c>=0)||(a>=0&&b<0&&c>=0)||(a>=0&&b>=0&&c<0))
            System.out.println("количество отрицательных чисел: 1\nколичество положительных чисел: 2");
        else if ((a<0&&b<0&&c>=0)||(a<0&&b>=0&&c<0)||(a>=0&&b<0&&c<0))
            System.out.println("количество отрицательных чисел: 2\nколичество положительных чисел: 1");
        else
            System.out.println("количество отрицательных чисел: 3\nколичество положительных чисел: 0");
    }
}
