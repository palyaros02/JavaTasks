package ru.mirea.pr10.task2;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public void sit(){
        System.out.println("Сижу на " + chair);
    }
}
