package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=  {10,20,30,40,50};
        int val = 40;
        int l = 0;
        int h = arr.length-1;

        while (l<=h){
            int mid = l+(h-l)/2;
            if (arr[mid] > val){
                h=mid-1;
            }
            else if (arr[mid]<val){
                l=mid+1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
