package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7, 7, 5};
        int largest = arr[0];
        int secondLargest = -1;
// brute
//        sort array -> largest=arr[n-1]
//          from i=n-2 to i>=0
//                if(arr[i] != largest){
//                    secondLargest = arr[i];
//                }
//                break;


//        better O(n)+O(n)
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]> secondLargest && arr[i] != largest){
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println(secondLargest);

//        optimal
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);




    }
}
