package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement {
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

        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int val: arr1) {
            if (fmap.containsKey(val)){
                int oldFrequency = fmap.get(val);
                int newFrequency = oldFrequency+1;
                fmap.put(val, newFrequency);
            }
            else{
                fmap.put(val,1);
            }
        }

        for (int val: arr2) {
            if (fmap.containsKey(val)){
                System.out.println(val);
                fmap.remove(val);
            }
        }
    }
}
