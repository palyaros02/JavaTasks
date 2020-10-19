package ru.mirea.pr7;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class myQueue {
    private static Queue<Integer> firstDeck = new LinkedList<>(),
                                 secondDeck = new LinkedList<>();

    myQueue(String[] first, String[] second){
        for (int i = 0; i < 5; i++) {
            firstDeck.add(Integer.parseInt(first[i]));
            secondDeck.add(Integer.parseInt(second[i]));
        }
    }
    public static String play(String[] first, String[] second) {
        new myQueue(first, second);
        for (int i = 0; i < 106; i++) {
            if (firstDeck.size() == 0)
                return "second "+i;
            else if (secondDeck.size()== 0)
                return "first "+i;
            else {
                Integer a = firstDeck.remove();
                Integer b = secondDeck.remove();
                if (a == 0 && b == 9){
                    firstDeck.add(a);
                    firstDeck.add(b);
                } else if (b == 0 && a == 9){
                    secondDeck.add(a);
                    secondDeck.add(b);
                } else if(a > b){
                    firstDeck.add(a);
                    firstDeck.add(b);
                } else {
                    secondDeck.add(a);
                    secondDeck.add(b);
                    }
            }
        }
        return "bolda";
    }
}
