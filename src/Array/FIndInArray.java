package Array;

import java.util.Scanner;

public class FIndInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int[] arr = new int[n];
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x){
                idx=i;
            }
        }
        System.out.println(idx);
    }
}
