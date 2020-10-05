package ru.mirea.pr5;

import java.util.Scanner;

public class task_3 {
/*
    3. От A до B
    Даны два целых числа A и В (каждое в отдельной строке). Выведите все
    числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
    убывания в противном случае.
*/
    public static void recursion(int a, int b, boolean flag){
            if (a==b) System.out.print(a);
            else {
                System.out.println(a);
                recursion(flag ? a+1 : a-1, b, flag);
            }
        }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        recursion(a, b, a < b);
    }
}
