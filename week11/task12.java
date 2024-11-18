import java.util.Scanner;
public class task12 {

    public static int sumOfColumn(int[][] matrix, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 3;
        int columns = 4;

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the 3x4 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < columns; j++) {
            int columnSum = sumOfColumn(matrix, j);
            System.out.println("Sum of column " + j + ": " + columnSum);
        }

        scanner.close();
    }
}

