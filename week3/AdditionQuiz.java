import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);//generate number1
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);//generate number1

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");//show quesion

        int answer = input.nextInt();// receive answer

        System.out.print(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));// display result
    }

}
