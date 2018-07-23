package chapter01;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static void main(String[] args) {
        String testString = "abcedf";
        System.out.println(isUnique(testString));
    }

    private static boolean isUnique(String str) {
        for (char ch : str.toCharArray()) {
          if (str.indexOf(ch)!=str.lastIndexOf(ch)) {
              return false;
          }
        }
        return true;
    }



    private static boolean isUnique1(String str) {
        Map<Character, Integer> characterIntMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (characterIntMap.get(ch)!=null) {
                return false;
            }
            characterIntMap.put(ch, 0);
        }
        return true;
    }


}
