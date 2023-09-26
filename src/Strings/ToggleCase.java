package Strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <='z'){
                char upperCase = (char)('A'+ch+-'a');
                str.setCharAt(i, upperCase);
            }
            else if (ch>='A' && ch<='Z'){
                char lowerCase = (char)('a'+ch+-'A');
                str.setCharAt(i, lowerCase);
            }
        }
        System.out.println(str.toString());

    }
}
