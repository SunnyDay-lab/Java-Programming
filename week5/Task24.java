import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        // Check if the user entered exactly one character and it is a letter
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            char ch = Character.toLowerCase(userInput.charAt(0));

            // Determine whether it is a vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println("# is an invalid input");
        }
    }
}
