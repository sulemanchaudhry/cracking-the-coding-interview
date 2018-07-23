package chapter01;

public class OneAway {
    public static void main(String[] args) {

//        String string2 = "pale";
//        for (int i=0;i<string2.length();i++) {
//            String joined = string2.substring(0,i)+string2.substring(i+1);
//            System.out.println(joined);
//        }
//
//

        System.out.println(oneAwayFunction("pale", "ple"));
        System.out.println(oneAwayFunction("pales", "pale"));
        System.out.println(oneAwayFunction("pale", "bale"));
        System.out.println(oneAwayFunction("pale", "bake"));
    }

    private static boolean oneAwayFunction(String string1, String string2) {
        if (Math.abs(string1.length()-string2.length())>1) {
            return false;
        } else if (string1.length()>string2.length()) {
            boolean oneAway = false;
            for (int i=0;i<string1.length();i++) {
                String cutString = (string1.substring(0,i)+string1.substring(i+1));
                if (cutString.equals(string2)) {
                    oneAway = true;
                }
                if (oneAway) {return true;}
            }
        } else if (string2.length()>string1.length()) {
            boolean oneAway = false;
            for (int i=0;i<string2.length();i++) {
                String cutString = (string2.substring(0,i)+string2.substring(i+1));
                if (cutString.equals(string1)) {
                    oneAway = true;
                }
                if (oneAway) {return true;}
            }
        }
        else if (string1.length()==string2.length()) {
            if (string1.equals(string2)) {return true;}
            int countDiffs = 0;
            for (int i=0; i<string1.length(); i++) {
                if (string1.charAt(i)!=string2.charAt(i)) {
                    countDiffs++;
                }
            }
            if (countDiffs==1) {return true;} else {return false;}
        }
        return false;
    }
}
