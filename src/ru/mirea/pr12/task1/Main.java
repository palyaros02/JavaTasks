package ru.mirea.pr12.task1;

public class Main {
    public static void main(String[] args) {
        Person x = new Person("Иванов", "Иван");
        System.out.println(x.getName());
    }
}
class Person{
    public static String name;
    public static String surname;
    public static String thirdName;

    public Person(String name, String surname, String thirdName) {
        Person.name = name;
        Person.surname = surname;
        Person.thirdName = thirdName;
    }

    public Person(String name, String surname) {
        Person.name = name;
        Person.surname = surname;
        Person.thirdName = "";
    }

    public Person(String name) {
        Person.name = name;
        Person.surname = "";
        Person.thirdName = "";
    }

    public static StringBuilder getName() {
        return new StringBuilder(surname +' '+ name +' '+ thirdName);
    }
}