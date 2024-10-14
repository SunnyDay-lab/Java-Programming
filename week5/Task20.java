public class Task20 {
    public static void main(String[] args) {
        // 默认右对齐输出
        System.out.printf("%8d%8s%8.1f%n", 1234, "Java", 5.63);

        // 使用减号(-)指定左对齐输出
        System.out.printf("%-8d%-8s%-8.1f%n", 1234, "Java", 5.63);
    }
}
