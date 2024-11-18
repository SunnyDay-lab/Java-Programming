import java.util.Arrays;
import java.util.Comparator;

public class task11 {
    public static void main(String[] args){
        int[][] workHours={
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,4,4},
                {9,3,4,3,3,2,2},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}
        };
        int[] totalHours=new int[workHours.length];
        for(int i=0;i<workHours.length;i++){
            int sum=0;
            for(int j=0;j<workHours[i].length;j++){
                sum+=workHours[i][j];
            }
            totalHours[i]=sum;
        }
        Integer[] employeeIndices = new Integer[totalHours.length];
        for (int i = 0; i < totalHours.length; i++) {
            employeeIndices[i] = i;
        }

        Arrays.sort(employeeIndices, new Comparator<Integer>() {
            @Override
            public int compare(Integer emp1, Integer emp2) {
                return Integer.compare(totalHours[emp2], totalHours[emp1]); // Decreasing order
            }
        });

        System.out.println("Employees and their total work hours in decreasing order:");
        for (int i = 0; i < employeeIndices.length; i++) {
            int empIndex = employeeIndices[i];
            System.out.println("Employee " + (empIndex + 1) + " total hours: " + totalHours[empIndex]);
        }
    }

}
