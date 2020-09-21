package ru.mirea.pr3;
import java.lang.*;
public class Test45 {
    public static void main(String[] args) {

        MovablePoint mp1 = new MovablePoint(0,0,1,1);
        System.out.println(mp1);
        mp1.moveUp(); mp1.moveUp();
        mp1.moveRight();
        System.out.println(mp1);

        MovableCircle mc1 = new MovableCircle(1,1,2,2,3);
        System.out.println(mc1);
        mc1.moveUp(); mc1.moveRight();
        System.out.println(mc1);

        MovableRectangle mr1 = new MovableRectangle(0,0,4,3,3,2);
        System.out.println(mr1);
        mr1.moveDown(); mr1.moveLeft();
        System.out.println(mr1);
    }
}
