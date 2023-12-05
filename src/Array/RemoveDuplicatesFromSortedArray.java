package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,9,9,3,3,3};
        Arrays.sort(arr);
//        brute O(n logn) + n -> sorting+traverse
//               sc-> O(n)

//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println(Arrays.toString(set.toArray()));

//        tc-> O(n) sc->O(1)
        int i = 0;
        for (int j = 1; j <arr.length ; j++) {
            if (arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        for (int j = 0; j < i+1; j++) {
            System.out.println(arr[j]);
        }


    }
}
