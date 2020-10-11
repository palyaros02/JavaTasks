package ru.stepik;

public class palindrome {
    public static boolean isPalindrome(String text) {
        String t1 = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder t2 = new StringBuilder(t1).reverse();
        return t1.equals(t2.toString());
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
