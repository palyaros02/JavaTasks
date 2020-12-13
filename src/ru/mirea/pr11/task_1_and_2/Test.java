package ru.mirea.pr11.task_1_and_2;

public class Test {
    public static void main(String[] args) {
        System.out.println("Testing ArrayQueue");
        ArrayQueue q1 = new ArrayQueue();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        System.out.println(q1);
        q1.dequeue();
        System.out.println("after delete = " +q1);
        System.out.println("element = " + q1.element());
        System.out.println("isEmpty = " + q1.isEmpty());
        System.out.println("size = " + q1.size());
        q1.clear();
        System.out.println("after clear size = " + q1.size() + "\nisEmpty = "+q1.isEmpty());
        System.out.println();

        System.out.println("Testing ArrayQueueADT");
        ArrayQueueADT q2 = new ArrayQueueADT();
        ArrayQueueADT.enqueue(q2,1);
        ArrayQueueADT.enqueue(q2,2);
        ArrayQueueADT.enqueue(q2,3);
        ArrayQueueADT.enqueue(q2,4);
        ArrayQueueADT.enqueue(q2,5);
        System.out.println(q2);
        ArrayQueueADT.dequeue(q2);
        System.out.println("after delete = " +q2);
        System.out.println("element = " + ArrayQueueADT.element(q2));
        System.out.println("isEmpty = " + ArrayQueueADT.isEmpty(q2));
        System.out.println("size = " + ArrayQueueADT.size(q2));
        ArrayQueueADT.clear(q2);
        System.out.println("after clear size = " + ArrayQueueADT.size(q2) + "\nisEmpty = "+ArrayQueueADT.isEmpty(q2));
        System.out.println();

        System.out.println("Testing ArrayQueueModule");
        ArrayQueueModule q3 = new ArrayQueueModule();
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        ArrayQueueModule.enqueue(4);
        ArrayQueueModule.enqueue(5);
        System.out.println(q3);
        ArrayQueueModule.dequeue();
        System.out.println("after delete = " +q3);
        System.out.println("element = " + ArrayQueueModule.element());
        System.out.println("isEmpty = " + ArrayQueueModule.isEmpty());
        System.out.println("size = " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println("after clear size = " + ArrayQueueModule.size() + "\nisEmpty = "+ ArrayQueueModule.isEmpty());
        System.out.println();

        System.out.println("Testing LinkedQueue");
        LinkedQueue q4 = new LinkedQueue();
        q4.enqueue(1);
        q4.enqueue(2);
        q4.enqueue(3);
        q4.enqueue(4);
        q4.enqueue(5);
        System.out.println(q4);
        q4.dequeue();
        System.out.println("after delete = " +q4);
        System.out.println("element = " + q4.element());
        System.out.println("isEmpty = " + q4.isEmpty());
        System.out.println("size = " + q4.size());
        q4.clear();
        System.out.println("after clear size = " + q4.size() + "\nisEmpty = "+q4.isEmpty());
        System.out.println();
    }
}
