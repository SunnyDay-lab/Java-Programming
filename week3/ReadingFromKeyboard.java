import java.util.Scanner;
public class ReadingFromKeyboard {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Byte value: ");
        byte byteValue =input.nextByte();
        System.out.println("The byte value is: "+byteValue);

        System.out.print("Enter a short value: ");
        byte shortValue =input.nextByte();
        System.out.println("The short value is: "+shortValue);

        System.out.print("Enter a float value: ");
        byte floatValue =input.nextByte();
        System.out.println("The byte value is: "+floatValue);


    }
}
