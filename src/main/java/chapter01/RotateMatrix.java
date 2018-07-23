package chapter01;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                matrix[i][j] = i*3 +j;
            }
        }

        System.out.println("BEFORE:");

        for (int i=0; i<3; i++ ) {
            for (int j=0; j<3; j++ ) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int[][] newMatrix = new int[3][3];
        for (int i=0; i<3; i++ ) {
            for (int j=0; j<3; j++ ) {
                newMatrix[j][2-i] = matrix[i][j];
            }
        }


        System.out.println();
        System.out.println("AFTER:");

        for (int i=0; i<3; i++ ) {
            for (int j=0; j<3; j++ ) {
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
