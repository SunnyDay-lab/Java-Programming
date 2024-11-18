public class task6 {
    public static void main(String[] args){
        int[][] matrix=new int[3][3];
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                matrix[row][column]=(int)(Math.random()*20);
            }
        }
        int t=0;
        int maxOfRow=0;
        int indexOfMaxRow=0;
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                t+=matrix[row][column];
            }
            if(t>maxOfRow){
                maxOfRow=t;
                indexOfMaxRow=row;
            }
            t=0;
        }

                System.out.println("The max of row is: "+indexOfMaxRow+" and the sum is: "+maxOfRow);

    }
    }

