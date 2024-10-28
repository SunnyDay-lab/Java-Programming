public class Week8Task8 {
    public static void main(String[] args) {
        int[] mylist = new int[10];

        System.out.println("Array before shuffling:");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = (int) (Math.random() * 100); // Assuming the range is 0 to 99
            System.out.print(mylist[i] + " ");
        }
        System.out.println("\nArray after shuffling:");
        for (int i = 0; i < mylist.length; i++) {
            int j = (int) (Math.random() * mylist.length); // Generate a random index
            int temp = mylist[i];
            mylist[i] = mylist[j];
            mylist[j] = temp;
            System.out.print(mylist[i] + " ");
        }
    }
}

