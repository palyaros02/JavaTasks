package ru.mirea.pr5;

import java.util.Scanner;

public class task_4 {
/*
    4. Заданная сумма цифр
    Даны натуральные числа k и s. Определите, сколько существует k-значных
    натуральных чисел, сумма цифр которых равна d. Запись натурального числа не
    может начинаться с цифры 0.
*/
    private static int chekSum(int digit) {
        int sum = 0;
        while (digit!=0){
            sum += digit%10;
            digit /= 10;
        }
        return sum;
    }

    public static void find(int digit, int k, int s) {
        find(digit, k, s, 0);
    }

    public static void find(int digit, int k, int s, int count) {
        if (digit == (int)Math.pow(10, k))
            System.out.println(count);
        else {
            do { //перебираю по 10 не в рекурсии для избежания переполнения стека
                if (chekSum(digit) == s) {
                    count++;
                }
                digit++;
            } while (digit % 10 != 0);

            find(digit, k, s, count);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа корректно отрабатывает вплоть до 5-и значных чисел");
        int k = scan.nextInt();
        while (k > 5) {
            System.out.println("Слишком большое k. Введите число поменьше.");
            k = scan.nextInt();
        }
        int s = scan.nextInt();
        System.out.println("Принято: k = "+k+" s = "+s);
        int digit = (int)Math.pow(10, k-1);
        find(digit, k, s);
    }
}
