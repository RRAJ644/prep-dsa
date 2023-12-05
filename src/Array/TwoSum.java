package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target= 13;
        System.out.println(twoSumBrute(arr, target));
        System.out.println(twoSumBetter(arr, target));
        System.out.println(twoSumOptimal(arr, target));
    }

    public static boolean twoSumBrute(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
//        tc->o(n^2) , sc-> o(1)
    }

    public static boolean twoSumBetter(int[] arr, int target){
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target-arr[i])){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
//        tc-> O(n * logn)
    }

    public static boolean twoSumOptimal(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int sum = arr[left]+arr[right];
            if (sum==target){
                return true;
            }
            else if (sum<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
//        tc->o(n)+o(n logn) , sc-> o(1)
    }
}
