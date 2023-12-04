package Maths;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

//        o(n)
        for (int i = 1; i<=n ; i++) {
            if (n % i == 0){
//                System.out.println(i);
            }
        }
//        o(sqrt(n))
        for (int i = 1; i*i <n ; i++) {
            if (n % i == 0){
               if (n/i == i){
                   System.out.println(i);
               }
               else{
                   System.out.println(i+" "+n/i);
               }
            }
        }
    }
}
