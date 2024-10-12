import java.util.Scanner;
public class GradesWithNestedIfElse {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = input.nextDouble();

        if(score >= 90){
            System.out.print("Grade is A");
        } else if (score >= 80) {
            System.out.print("Grade is B");
        } else if (score >= 70) {
            System.out.print("Grade is C");
        } else if (score >= 60) {
            System.out.print("Grade is D");
        }else {
            System.out.print("Grade is F");
        }
    }
}
