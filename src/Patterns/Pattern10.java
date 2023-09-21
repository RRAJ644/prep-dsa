package Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int outerSpace = n/2;
        int innerSpace = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=outerSpace ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1; j <= innerSpace ; j++) {
                System.out.print(" ");
            }

            if (i>1 && i< n){
                System.out.print("* ");
            }

            if (i <= n/2) {
                outerSpace--;
                innerSpace+=2;
            }
            else{
                outerSpace++;
                innerSpace-=2;
            }
            System.out.println();
        }




    }
}
