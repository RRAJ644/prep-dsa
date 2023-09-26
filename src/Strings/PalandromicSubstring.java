package Strings;

import java.util.Scanner;

public class PalandromicSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                String subString = str.substring(i,j);
                if ((isPalindrome(subString))){
                    System.out.println(subString);
                }
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(String str) {
       int i=0;
       int j= str.length()-1;

       while (i<=j){
           char ch1 = str.charAt(i);
           char ch2 = str.charAt(j);

           if (ch1 != ch2){
               return false;
           }
           else{
           i++;
           j--;
           }
       }
        return true;
    }
}
