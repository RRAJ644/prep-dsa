package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HIghestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)){
                int oldFrequency = hm.get(ch);
                int newFrequency = oldFrequency+1;
            }else{
                hm.put(ch, 1);
            }
        }
        char charMax = str.charAt(0);
        for(Character key: hm.keySet()){
            if (hm.get(key) > hm.get(charMax)){
                charMax = key;
            }
        }

        System.out.println(charMax);
    }
}
