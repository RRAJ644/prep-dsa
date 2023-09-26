package Strings;

import java.util.Scanner;

public class AsciiDifference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length() ; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr-prev;
            sb.append(gap);
            sb.append(curr);
        }

        System.out.println(sb.toString());
    }
}