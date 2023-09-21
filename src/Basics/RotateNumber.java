package Basics;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int rot = scn.nextInt();

        int temp = num;
        int nod = 0;
        while (temp > 0){
            temp/=10;
            nod++;
        }

        rot = rot%nod;
        if (rot<0){
            rot+=nod;
        }

        int div = 1;
        int mult = 1;

        for (int i = 1; i <= nod ; i++) {
            if (i<=rot) {
                div *=10;
            }
            else{
                mult*=10;
            }
        }
        int q = num/div;
        int r = num%div;

        int rotatedNum = r * mult + q;
        System.out.println(rotatedNum);

    }
}
