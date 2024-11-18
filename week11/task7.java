public class task7 {
    public static void main(String[] args){
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                int i1=(int)(Math.random()*matrix.length);
                int j1=(int)(Math.random()*matrix[row].length);
                int temp=matrix[row][column];
                matrix[row][column]=matrix[i1][j1];
                matrix[i1][j1]=temp;
            }
        }

        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
