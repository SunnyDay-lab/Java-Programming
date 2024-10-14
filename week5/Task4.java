public class Task4{
    public static void main(String[] args) {
        // max方法示例
        int maxResult = Math.max(2, 3);
        System.out.println("Math.max(2, 3) returns: " + maxResult);

        // min方法示例
        double minResult = Math.min(2.5, 4.6);
        System.out.println("Math.min(2.5, 4.6) returns: " + minResult);

        // 组合max和min方法的示例
        double combinedMaxMinResult = Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6));
        System.out.println("Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) returns: " + combinedMaxMinResult);

        // abs方法示例
        int absIntResult = Math.abs(-2);
        System.out.println("Math.abs(-2) returns: " + absIntResult);

        double absDoubleResult = Math.abs(-2.1);
        System.out.println("Math.abs(-2.1) returns: " + absDoubleResult);

        // random方法示例
        int randomIntBetween0And9 = (int)(Math.random() * 10);
        System.out.println("(int)(Math.random() * 10); returns a random integer between 0 and 9: " + randomIntBetween0And9);

        int randomIntBetween50And99 = (50 + (int)(Math.random() * 50));
        System.out.println("(50 + (int)(Math.random() * 50)); returns a random integer between 50 and 99: " + randomIntBetween50And99);

        // 一般情况下的random方法示例
        int a = 100;
        int b = 20;
        int generalRandomInt = a + (int)(Math.random() * b);
        System.out.println("a + (int)(Math.random() * b); returns a random integer between a and a+b-1: " + generalRandomInt);
    }
}
