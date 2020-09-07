package ru.mirea.pr1;
import java.lang.*;
public class Test {

    public static void main(String[] args) {

        Dog d1 = new Dog("Bobik", 2);
        Dog d2 = new Dog("Rex");
        Dog d3 = new Dog();

        Ball b1 = new Ball("small", "red");
        Ball b2 = new Ball("medium");
        Ball b3 = new Ball();

        Book bk1 = new Book("Buratino", 120);
        Book bk2 = new Book("War and Peace", 1000);
        Book bk3 = new Book();

        d3.setAge(5);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        b3.setSize("large");
        b1.toString();
        b2.toString();
        b3.toString();

        System.out.println(bk3);
        bk3.setPages(1337);
        System.out.println(bk3);
        bk1.howLongToRead();
        bk2.howLongToRead();
        bk3.howLongToRead();
    }
}
