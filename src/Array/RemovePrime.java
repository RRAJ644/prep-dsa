package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        for (int i = list.size()-1; i >=0 ; i--) {
            int val = list.get(i);
            if (isPrime(val)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i *i <=num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
