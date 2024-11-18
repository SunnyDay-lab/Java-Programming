import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        int[][] matrix=new int[3][3];

        Scanner input =new Scanner(System.in);
        System.out.println("Enter values in "+ matrix.length+" rows and "+
                matrix[0].length+" columns: ");
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                matrix[row][column]=input.nextInt();
            }
        }
        input.close();
    }
}
