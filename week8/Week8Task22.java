import java.util.Scanner;

public class Week8Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        input.close();

        double smallest = min(numbers);
        System.out.println("The minimum number is " + smallest);
    }
    public static double min(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}