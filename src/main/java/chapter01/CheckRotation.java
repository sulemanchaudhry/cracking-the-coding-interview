package chapter01;

public class CheckRotation {
    public static void main(String[] args) {
//        System.out.println(rotateRight("book"));
        System.out.println(checkRotation("waterbottle", "erbottlewat"));
        System.out.println(checkRotation("waterbottle", "erboxxxxwat"));
    }

    private static boolean checkRotation(String string1, String string2) {
        return isSubstring(string2+string2, string1);
    }


    private static boolean isSubstring(String str1, String str2) {
        return str1.contains(str2);
    }

    private static boolean checkRotation1(String string1, String string2) {
        if (string1.length()!=string2.length()) { return false;}
        String rotated = string1;
        for (int i = 0; i < string1.length(); i++) {
            rotated = rotateRight(rotated);
            if (rotated.equals(string2)) {return true;}
        }
        return false;
    }

    private static String rotateRight(String string1) {
        return string1.substring(string1.length()-1,string1.length())+string1.substring(0,string1.length()-1);
    }
}
