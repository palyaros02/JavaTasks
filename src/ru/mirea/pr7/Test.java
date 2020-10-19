package ru.mirea.pr7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колоды игроков:");
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        System.out.println("\nТестирование через Stack:");
        System.out.println(myStack.play(first, second));
        System.out.println("\nТестирование через Queue:");
        System.out.println(myQueue.play(first, second));
        System.out.println("\nТестирование через Deque:");
        System.out.println(myDeque.play(first, second));
        System.out.println("\nТестирование через DoubleList:");
        System.out.println(myDoubleList.play(first, second));
        }
}
