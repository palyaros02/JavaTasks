package ru.stepik;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i<=value; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial); // your implementation here
    }
}
