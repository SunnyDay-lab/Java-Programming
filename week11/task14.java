import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class task14 {

    public static void shuffleRows(int[][] matrix) {
        List<int[]> rowList = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            rowList.add(matrix[i]);
        }

        Collections.shuffle(rowList);

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = rowList.get(i);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        shuffleRows(matrix);

        System.out.println("\nShuffled Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

