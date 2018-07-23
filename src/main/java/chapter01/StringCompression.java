package chapter01;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(stringCompression("kllaabcccccaaz"));
    }

    private static String stringCompression(String s) {
        StringBuilder output = new StringBuilder("");
        int count=1;
        for (int i=0; i<s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i+1==s.length()) {
                output = output.append(thisChar+""+count);
                break;
            }
            char nextChar = s.charAt(i+1);
            if (thisChar==nextChar) {
                ++count;
            } else
            {
                output = output.append(thisChar+""+count);
                count = 1;
            }
        }
        return output.toString();
    }
}
