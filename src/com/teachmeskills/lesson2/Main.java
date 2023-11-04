package com.teachmeskills.lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int c = 2;
        int b = 5;
        int a = 4 *(b + c - 1) / 2;
        System.out.println(a);

        System.out.println("задача 2,3");

        int number = 28;
        int sum = 0;
        int ost;

        while (number != 0) {
            ost = number % 10;
            sum += ost;
            number = number/10;
        }
        System.out.println(sum);
    }
}
