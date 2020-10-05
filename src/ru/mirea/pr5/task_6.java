package ru.mirea.pr5;

import java.util.Scanner;

public class task_6 {
/*
        6. Проверка числа на простоту
    Дано натуральное число n>1. Проверьте, является ли оно простым.
    Программа должна вывести слово YES, если число простое и NO, если число
    составное. Алгоритм должен иметь сложность O(logn).
    Указание. Понятно, что задача сама по себе нерекурсивна, т.к. проверка
    числа n на простоту никак не сводится к проверке на простоту меньших чисел.
    Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно
    по этому параметру и делать рекурсию.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        return isPrime(n, 2, false);
    }

    private static boolean isPrime(int n, int divisor, boolean flag) {
        if (divisor == n)
            return true;
        if(n%divisor == 0)
            return false;
        flag = isPrime(n, ++divisor, flag);
        return flag;
    }
}
