package Array;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1,1,1};
//        int [] temp = new int [arr.length];
//        int idx = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0){
//                temp[idx++] = arr[i];
//            }
//        }
//
//        for (int i = 0; i < temp.length; i++) {
//            arr[i]=temp[i];
//        }
//
//        for (int i = temp.length; i < arr.length ; i++) {
//            arr[i] = 0;
//        }



        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                j=i;
                break;
            }
        }

        for (int i = j+1; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
