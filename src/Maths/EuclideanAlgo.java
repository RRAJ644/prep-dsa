package Maths;

import java.util.Scanner;

public class EuclideanAlgo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        while (a>0 && b>0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a==0){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
// O(log i (min(a,b)))