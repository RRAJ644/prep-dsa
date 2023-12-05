package Array;

import java.util.Arrays;

public class LeftRotateByDplaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int d = 3;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i<arr.length ; i++) {
            arr[i - d] = arr[i];
        }

//        int j =0;
        for (int i = arr.length-d; i < arr.length; i++) {
            arr[i]=temp[i-(arr.length-d)];
//            j++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
