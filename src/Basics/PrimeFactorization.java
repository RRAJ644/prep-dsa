package Basics;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0 ) {
                num = num/i;
                System.out.println(i);
            }
        }

        if (num != 1) {
            System.out.println(num);
        }
    }
}
