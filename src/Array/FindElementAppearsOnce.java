package Array;

import java.util.Arrays;

public class FindElementAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
//        for (int i = 1; i<=n ; i++) {
//            int flag=0;
//            for (int j = 0; j < n-1; j++) {
//                if (arr[j] == i){
//                    flag=1;
//                    break;
//                }
//            }
//            if (flag==0){
//                System.out.println(i);
//                return;
//            }
//        }
//        tc->O(n*n) sc->O(1)

//        better -using hashing
//        int[] hash = new int[n+1];
//        for (int i = 0; i < n-1; i++) {
//            hash[arr[i]]++;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (hash[i] == 0){
//                System.out.println(i);
//                return;
//            }
//        } tc-> o(n)  sc->o(n)

//        using summation
//        int sum =(n*(n+1))/2;
//        int s2 =0;
//        for (int num: arr) {
//            s2+=num;
//        }
//        System.out.println("Missing Number: " + (sum-s2));
//        tc-> o(n) sc-> o(1)

//        Xor
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < (n - 1); i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ n;
        System.out.println(xor1 ^ xor2); // the missing number
//        tc-> o(n), sc-> o(1)
    }
}
