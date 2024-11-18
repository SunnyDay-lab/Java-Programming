public class task3 {
    public static void main(String[] args){
        int[][] matrix=new int[3][3];
        for(int row=0;row<matrix.length;row++){
            for(int columns=0;columns<matrix[0].length;columns++){
                matrix[row][columns]=(int)(Math.random()*20);
            }
        }
        System.out.println(matrix[0][0]);
    }
}
