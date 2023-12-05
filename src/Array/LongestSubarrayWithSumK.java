package Array;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        int n = arr.length;

//        bruteforce tc-> o(n^3)
//        int len = 0;
//        for (int i = 0; i < n; i++) { // starting index
//            for (int j = i; j < n; j++) { // ending index
//                long s = 0;
//                for (int K = i; K <= j; K++) {
//                    s += arr[K];
//                }
//
//                if (s == k){
//                    len = Math.max(len, j - i + 1);
//                }
//            }
//        }
//        System.out.println(len);

// better tc->o(n^2)
//        int len = 0;
//        for (int i = 0; i < n; i++) { // starting index
//            long s = 0;
//            for (int j = i; j < n; j++) { // ending index
//                s += arr[j];
//                if (s == k){
//                    len = Math.max(len, j - i + 1);
//                }
//            }
//        }
//        System.out.println(len);

//hashing
        int sum = 0;
        int len = 0;



    }
}
