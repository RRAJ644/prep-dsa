package Strings;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int n = str.length();
        int f = factorial(n);

        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int div = n; div >=1 ; div--) {
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }

    }

    public static int factorial(int num) {
        int val =1;
        for (int i = 2; i <= num; i++) {
            val= val*i;
        }
        return val;
    }
}
