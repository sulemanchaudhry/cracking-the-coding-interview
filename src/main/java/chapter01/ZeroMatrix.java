package chapter01;

public class ZeroMatrix {

    private static int WIDTH = 5;
    private static int HEIGHT = 5;

    public static void main(String[] args) {
        int[][] dataArray = new int[5][5];
        dataArray[0][0] = 0;dataArray[1][0] = 6;dataArray[2][0] = 6;dataArray[3][0] = 6;dataArray[4][0] = 6;
        dataArray[0][1] = 6;dataArray[1][1] = 6;dataArray[2][1] = 6;dataArray[3][1] = 6;dataArray[4][1] = 6;
        dataArray[0][2] = 6;dataArray[1][2] = 6;dataArray[2][2] = 6;dataArray[3][2] = 6;dataArray[4][2] = 6;
        dataArray[0][3] = 6;dataArray[1][3] = 6;dataArray[2][3] = 0;dataArray[3][3] = 6;dataArray[4][3] = 6;
        dataArray[0][4] = 6;dataArray[1][4] = 6;dataArray[2][4] = 6;dataArray[3][4] = 6;dataArray[4][4] = 6;
        int[][] outputArray = zeroMatrix(dataArray);
        for (int i=0; i<WIDTH; i++ ) {
            for (int j=0; j<HEIGHT; j++ ) {
                System.out.print(outputArray[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] zeroMatrix(int[][] inputMatrix) {
        int[][] outputArray = new int[5][5];
        for (int i=0; i<WIDTH; i++ ) {
            for (int j=0; j<HEIGHT; j++ ) {
                outputArray[i][j] = inputMatrix[i][j];
            }
        }

        for (int i=0; i<WIDTH; i++ ) {
            for (int j=0; j<HEIGHT; j++ ) {
                if (inputMatrix[i][j]==0) {
                    for (int k=0; k<HEIGHT; k++ ) {
                        outputArray[i][k] = 0;
                    }
                    for (int l=0; l<WIDTH; l++ ) {
                        outputArray[l][j] = 0;
                    }
                }
            }
        }



        return outputArray;
    }
}
