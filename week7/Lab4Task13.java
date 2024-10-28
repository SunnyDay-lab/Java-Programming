import java.util.Scanner;
public class Lab4Task13 {
    
    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("please input 16 hex ");
        String hexNumber = scanner.nextLine();
        
        try {
            int decimalNumber = hexToDecimal(hexNumber);
            System.out.println("16 hex " + hexNumber + " its 10 is " + decimalNumber);
        } catch (NumberFormatException e) {
            System.out.println("input error");
        } finally {
            scanner.close();
        }
    }
}

