import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = scanner.nextInt();

        if (decimalValue >= 0 && decimalValue <= 15) {
            String hexValue = Integer.toHexString(decimalValue).toUpperCase();
            System.out.println("The hex value is " + hexValue);
        } else {
            System.out.println(decimalValue + " is an invalid input");
        }

        scanner.close();
    }
}
