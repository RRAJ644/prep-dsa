package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String compressed1 = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                compressed1 += curr;
            }
        }

        System.out.println(compressed1);


        String compressed2 = str.charAt(0) + "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count>1) {
                    compressed2+=count;
                    count=1;
                }
                compressed2+=curr;

            }
        }
        if (count > 1){
            compressed2+=count;
        }

        System.out.println(compressed2);


    }
}
