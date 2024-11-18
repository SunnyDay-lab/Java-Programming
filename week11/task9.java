public class task9 {
    public static void main(String[] args){
        char[][] answers={
                {'A','B','A','D','C'},
                {'B','B','A','C','C'},
                {'B','B','C','D','B'},
                {'A','B','A','D','C'},
                {'A','B','A','D','C'}
        };
        char[] keys={'A','B','A','D','C'};
        for(int i=0;i<answers.length;i++){
            int correctAnswers=0;
            for(int j=0;j<answers[i].length;j++){
                if(answers[i][j]==keys[j])
                    correctAnswers++;
            }
            System.out.println("Student "+i+"is correct count is "+correctAnswers);
        }
    }
}
