package Array;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i <n ; i++) {
            if (arr[i]>=arr[i-1]){
                continue;
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
