package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,4,5,6};
        int[] arr2 = {3,4,4,7,8};

//        HashSet<Integer> hs = new HashSet<>();
//        for (int num: arr1) {
//            hs.add(num);
//        }
//        for (int num: arr2) {
//            hs.add(num);
//        }
//
//        int[] uninon = new int[hs.size()];
//        int idx = 0;
//        for (int num: hs) {
//            uninon[idx++] = num;
//        }
//        System.out.println(Arrays.toString(uninon));

//        tc-> O(n1 logn)+O(n2 logn)+O(n1+n2)
//        sc-> O(n1+n2)

        int i=0;
        int j=0;
        int k=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int [] union = new int[n1+n2];

        while (i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
                union[k] = arr1[i];
                i++;
                k++;
            }
            else{
                union[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<n1){
            union[k] = arr1[i];
            i++;
            k++;
        }

        while (j<n2){
            union[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(union));
    }
}
