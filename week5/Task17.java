public class Task17 {
    public static void main(String[] args) {
        // String to integer
        String a = "123";
        System.out.println(a+1);
        int b = Integer.parseInt(a);
        System.out.println(b+1);

        // String to double
        String x = "123.45";
        System.out.println(x+1);
        Double y = Double.parseDouble(x);
        System.out.println(y+1);

        // Number to String
        String s = 123 + "";
        System.out.println(s+1);
    }
}
