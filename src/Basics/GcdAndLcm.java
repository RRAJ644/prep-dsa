package Basics;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int orgNum1 = num1;
        int orgNum2 = num2;

        while (num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;
        int lcm = (orgNum1 * orgNum2)/gcd;

        System.out.println(gcd+" "+lcm);
    }
}
