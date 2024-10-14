import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            char ch = input.charAt(0);
            System.out.println("The character entered is '" + ch + "'");
        } else {
            System.out.println("No character was entered.");
        }

        scanner.close(); // 关闭scanner以防止资源泄漏
    }
}
