package Matrices;

import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int[][] mat1 = new int[r1][c1];

        for (int i = 0; i < mat1.length ; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }

        int[][] mat2 = new int[r2][c2];

        for (int i = 0; i < mat2.length ; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2){
            System.out.println("Can't Multiply");
            return;
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }



    }
}
