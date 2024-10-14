public class Task21 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s%10s%10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        // Display values for 30 degree
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n", degrees, radians,
                Math.sin(radians), Math.cos(radians), Math.tan(radians));

        // Display values for 60 degree
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n", degrees, radians,
                Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
