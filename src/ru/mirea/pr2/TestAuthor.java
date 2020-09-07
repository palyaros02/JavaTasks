package ru.mirea.pr2;
import java.lang.*;
public class TestAuthor {

    public static void main(String[] args) {

        Author a = new Author("Steve Peterson", "example@mail.com", 'M');

        System.out.println(a);
        a.setEmail("steve@mail.com");
        System.out.println(a);
    }
}
