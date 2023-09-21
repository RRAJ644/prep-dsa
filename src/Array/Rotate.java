package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int i, int j) {
       int li = i;
       int ri=j;
       while (li<ri){
           int temp = arr[li];
           arr[li] = arr[ri];
           arr[ri] = temp;
           li++;
           ri--;
       }
    }

    public static void rotate(int[] arr, int k) {
        k=k%arr.length;
        if (k<=0){
            k+= arr.length;
        }

        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }
}
