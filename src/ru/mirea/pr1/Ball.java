package ru.mirea.pr1;

public class Ball {
    private String color;
    private String size;

    public Ball(String n, String a ){
        color = n;
        size = a;
    }
    public Ball(String n ){
        color = n;
        size = "small";
    }
    public Ball( ){
        color = "yellow";
        size = "small";
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setSize(String Name){
        this.size = size;
    }
    public String getColor(){
        return color;
    }
    public String getSize(){
        return size;
    }
    public String toString(){
        return this.size+" and  "+this.color+" ball.";
    }
}
