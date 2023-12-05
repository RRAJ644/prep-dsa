package Array;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
//        System.out.println();
        System.out.println(Arrays.toString(sort012Brute(arr)));
        System.out.println(Arrays.toString(sort012Better(arr)));
        System.out.println(Arrays.toString(sort012Optimal(arr)));
    }
    public static int[] sort012Brute(int[] arr){
        Arrays.sort(arr);
        return arr;
//        tc->o(1) sc->o(1)
    }

    public static int[] sort012Better(int[] arr){
        int countZero=0 , countOne=0, countTwo= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if (arr[i]==1) {
                countOne++;
            }else{
                countTwo++;
            }
        }

        for (int i = 0; i < countZero; i++) {
            arr[i]=0;
        }
        for (int i = countZero; i < countZero+countOne; i++) {
            arr[i] = 1;
        }
        for (int i = countZero+countOne; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
//        tc-> O(n) sc->O(1)
    }

    //        Dutch National Flag Algorithm
    public static int[] sort012Optimal(int[] arr){
//        0 to low-1 -> 0 [extreme left]
//        low to mid-1 -> 1
//        high+1 to arr.length-1 -> 2 [extreme right]

        int low=0;

        return arr;
    }

}
