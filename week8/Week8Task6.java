public class Week8Task6 {
    public static void main(String[] args){
        float[] mylist = new float[5];

        for(int i = 1 ;i< mylist.length; i++){
            mylist[i] = (float) Math.random()*10;
        }
        for(int i = 0;i< mylist.length;i++){
            System.out.print(mylist[i]+"  ");
        }
    }
}
