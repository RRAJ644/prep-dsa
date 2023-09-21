package BinarySearch;

import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int low=0;
        int high = arr.length-1;
        int firstIdx = -1;

        while (low<=high){
            int mid = low+ (high-low)/2;
            if (arr[mid]<data){
                low=mid+1;
            }else if (arr[mid]>data){
                high=mid-1;
            }else{
                firstIdx=mid;
                high=mid-1;
            }
        }
        System.out.println(firstIdx);

        low=0;
        high = arr.length-1;
        int lastIdx = -1;
        while (low<=high){
            int mid = low+ (high-low)/2;
            if (arr[mid]<data){
                low=mid+1;
            }else if (arr[mid]>data){
                high=mid-1;
            }else{
                lastIdx=mid;
                low=mid+1;
            }
        }
        System.out.println(lastIdx);
    }
}
