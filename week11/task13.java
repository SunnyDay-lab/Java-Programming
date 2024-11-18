import java.util.Random;

public class task13 {

    public static void main(String[] args) {
        Random random = new Random();

        int rows = 4;
        int columns = 4;

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(2); // Fill with 0 or 1
            }
        }

        System.out.println("4x4 Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxRowOnes = -1;
        int rowWithMostOnes = -1;
        for (int i = 0; i < rows; i++) {
            int onesCount = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxRowOnes) {
                maxRowOnes = onesCount;
                rowWithMostOnes = i;
            }
        }

        int maxColumnOnes = -1;
        int columnWithMostOnes = -1;
        for (int j = 0; j < columns; j++) {
            int onesCount = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxColumnOnes) {
                maxColumnOnes = onesCount;
                columnWithMostOnes = j;
            }
        }

        System.out.println("Row with the most 1s: Row " + (rowWithMostOnes + 1) + " with " + maxRowOnes + " ones.");
        System.out.println("Column with the most 1s: Column " + (columnWithMostOnes + 1) + " with " + maxColumnOnes + " ones.");
    }
}
