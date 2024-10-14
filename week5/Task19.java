public class Task19 {
    public static void main(String[] args) {
        int count = 5;
        double amount = 45.56;

        // 使用printf格式化输出
        System.out.printf("Count is %d and amount is %.2f%n", count, amount);

        // 显示带有千分位分隔符的数字
        long number1 = 12345678L;
        double number2 = 12345678.263;

        System.out.printf("%,8d %n", number1);       // 输出：12,345,678
        System.out.printf("%,10.1f%n", number2);     // 输出：12,345,678.3
    }
}
