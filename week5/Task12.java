import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        System.out.println("si is "+s1);
        System.out.println("si is "+s2);
        System.out.println("si is "+s3);
        input.close();
    }
}
