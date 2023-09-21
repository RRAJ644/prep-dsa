package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int i=0;
        int j= arr.length-1;

        while (i<j){
            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

            i++;
            j--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
