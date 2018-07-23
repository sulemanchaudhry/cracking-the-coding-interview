package chapter01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutations {
    public static void main(String[] args) {
        System.out.println(checkPermutations("abbd", "adbb"));
    }

    // whitespace; ignore?
    private static boolean checkPermutations(String string1, String string2) {
        if (string1.length()!=string2.length()) {
            return false;
        }
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int i =0 ;i<char1.length; i++) {
            if (char1[i]!=char2[i]){
                return false;
            }
        }
        return true;
    }
}
