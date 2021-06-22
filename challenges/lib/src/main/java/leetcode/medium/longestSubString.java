package leetcode.medium;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class longestSubString {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int current = 0;
        char last = s.length() > 0 ? s.charAt(0) : 'a';
        for (char c:s.toCharArray()) {
            if (c == last) {
                if (current > max) max = current;
                current = 0;
            }
            current++;
        }
        return current > max ? current : max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        System.out.println();
//        String us = NumberFormat.getCurrencyInstance(Locale.lookup("usa"));
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}
