package ru.mirea.pr12.task2;

public class Main {
    public static void main(String[] args) {
        String test = "Россия, Москва, Москва, пр-т Вернадского, 78, ст.1, 1";
        Address test1 = new Address();
        test1.splitAddress(test);
        System.out.println(test1);

        Address test2 = new Address();
        test2.tokenizeAddress(test);
        System.out.println(test2);

}}

