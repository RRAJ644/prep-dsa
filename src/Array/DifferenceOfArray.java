package Array;

import java.util.Scanner;

public class DifferenceOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n ; i++) {
            arr1[i]= scn.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i]= scn.nextInt();
        }

        int[] diff = new int[m];
        int c = 0;

        int i = arr1.length-1;
        int j= arr2.length-1;
        int k= diff.length-1;

        while (k>=0){
            int d = 0;
            int arr1v = i>=0? arr1[i]: 0;

            if (arr2[j]+c>=arr1v){
                d += arr2[j]+c - arr1v;
                c=0;
            }
            else{
                d = arr2[j]+c+10 - arr1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx<diff.length){
            if (diff[idx] == 0){
                idx++;
            }
            else{
                break;
            }
        }

        while (idx< diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
