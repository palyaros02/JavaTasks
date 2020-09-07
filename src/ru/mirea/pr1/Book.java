package ru.mirea.pr1;

public class Book {
    private String name;
    private int pages;

    public Book(String n, int a ){
        name = n;
        pages = a;
    }
    public Book(String n ){
        name = n;
        pages = 0;
    }
    public Book( ){
        name = "42";
        pages = 42;
    }

    public void setPages(int age){
        this.pages = age;
    }
    public void setName(String Name){
        this.name = name;
    }
    public int getPages(){
        return pages;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name+" includes "+this.pages+" pages.";
    }
    public void howLongToRead(){
        System.out.println("It is taking "+(pages/2)/60+" hours and "+(pages/2)%60+" minutes to read "+name);
    }
}
