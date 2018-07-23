package chapter01;

public class URLIfy {
    public static void main(String[] args) {
        String inputString = "Mr John Smith    ";
        System.out.println(encodeSpaces(inputString));
    }

    private static String encodeSpaces(String inputString) {
        char[] inputStringCharArray = inputString.toCharArray();
        for (int i =0;i<inputStringCharArray.length; i++) {
            if (inputStringCharArray[i]==' ') {
                for (int j=inputStringCharArray.length-1; j>i+2; j--) {
                    inputStringCharArray[j] = inputStringCharArray[j-2];
                }
                inputStringCharArray[i]   = '%';
                inputStringCharArray[i+1] = '2';
                inputStringCharArray[i+2] = '0';
            }
        }
        return new String(inputStringCharArray);
    }
}
