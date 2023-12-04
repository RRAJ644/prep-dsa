package Maths;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n<=1){
            System.out.println(false);
            return;
        }
        int c = 2;
        while (c*c<=n){
            if (n%c == 0){
                System.out.println(n+ " is Not a prime number");
                return;
            }
            c++;
        }
        System.out.println(n+" is Prime number");
    }
}
