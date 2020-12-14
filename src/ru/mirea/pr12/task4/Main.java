package ru.mirea.pr12.task4;

public class Main {
    public static void main(String[] args) {
        String str = "89149692089";
        System.out.println(myString.normalize(str));

        String str1 = "+79149692089";
        System.out.println(myString.normalize(str1));

        String str2 = "9149692089";
        System.out.println(myString.normalize(str2));
    }
}
class myString {
    public static String normalize(String str) {
        if (str.length()>12 || str.length()<11 || (!str.startsWith("+") && !str.startsWith("8")))
            return "incorrect input";
        StringBuffer temp = new StringBuffer(str);
        if (str.startsWith("8"))
            temp.replace(0,1,"+7");
        temp.insert(5, "-");
        temp.insert(9, "-");
        return temp.toString();
    }
}
