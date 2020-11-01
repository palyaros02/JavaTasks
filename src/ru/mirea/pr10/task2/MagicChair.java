package ru.mirea.pr10.task2;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Вжух, и стул взлетел...");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
