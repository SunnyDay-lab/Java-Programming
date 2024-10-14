import java.util.Scanner;

public class Lab6Task5 {
    public static void main(String[] args){
        int num=1,count=1,sum=0;
        Scanner input = new Scanner(System.in);

        while(num != 0 && count == 1){
            if(num == 0){
                count = 0;
            }
            System.out.print("Enter an integer (the input ends if it is 0): ");
            num = input.nextInt();
            sum = num + sum;
        }
        System.out.println("The sum is "+sum);
    }
}
