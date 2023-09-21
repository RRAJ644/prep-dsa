package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] inverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Calculate the inverse
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            inverse[val] = i;
        }

        System.out.println(Arrays.toString(inverse));
    }
}
