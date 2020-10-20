package ru.mirea.pr8;

public class Test {
    public static void main(String[] args) {
        WaitList<Boolean> test1 = new WaitList<>();
        BoundedWaitList<Integer> test2 = new BoundedWaitList<>(3);
        UnfairWaitList<String> test3 = new UnfairWaitList<>();

        test1.add(true);
        test1.add(false);
        test1.add(true);
        System.out.println(test1);
        System.out.println(test1.isEmpty());

        test2.add(1);
        test2.add(2);
        test2.add(3);
        System.out.println("trying to add 4th element:");
        try {
            test2.add(4);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(test2.contains(5));
        System.out.println(test2);

        test3.add("qwe");
        test3.add("rty");
        test3.add("uio");
        test3.add("qwe");
        System.out.println(test3);
        test3.remove("rty");
        test3.add("rty");
        test3.moveToBack("uio");
        System.out.println(test3);
    }
}

