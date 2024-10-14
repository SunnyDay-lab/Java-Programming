public class Task3 {
    public static void main(String[] args) {
        // ceil方法示例
        double ceil1 = Math.ceil(2.1);
        System.out.println("Math.ceil(2.1) returns " + ceil1);

        double ceil2 = Math.ceil(2.0);
        System.out.println("Math.ceil(2.0) returns " + ceil2);

        double ceil3 = Math.ceil(-2.0);
        System.out.println("Math.ceil(-2.0) returns " + ceil3);

        double ceil4 = Math.ceil(-2.1);
        System.out.println("Math.ceil(-2.1) returns " + ceil4);

        // floor方法示例
        double floor1 = Math.floor(2.1);
        System.out.println("Math.floor(2.1) returns " + floor1);

        double floor2 = Math.floor(2.0);
        System.out.println("Math.floor(2.0) returns " + floor2);

        double floor3 = Math.floor(-2.0);
        System.out.println("Math.floor(-2.0) returns " + floor3);

        double floor4 = Math.floor(-2.1);
        System.out.println("Math.floor(-2.1) returns " + floor4);

        // rint方法示例
        double rint1 = Math.rint(2.1);
        System.out.println("Math.rint(2.1) returns " + rint1);

        double rint2 = Math.rint(2.5);
        System.out.println("Math.rint(2.5) returns " + rint2);

        double rint3 = Math.rint(3.5);
        System.out.println("Math.rint(3.5) returns " + rint3);

        double rint4 = Math.rint(-2.0);
        System.out.println("Math.rint(-2.0) returns " + rint4);

        double rint5 = Math.rint(-2.1);
        System.out.println("Math.rint(-2.1) returns " + rint5);

        double rint6 = Math.rint(-2.5);
        System.out.println("Math.rint(-2.5) returns " + rint6);

// round方法示例
        int round1 = (int)Math.round(2.6f);
        System.out.println("Math.round(2.6f) returns " + round1 + " // Returns int");

        long round2 = (long)Math.round(2.0);
        System.out.println("Math.round(2.0) returns " + round2 + " // Returns long");

        int round3 = (int)Math.round(-2.0f);
        System.out.println("Math.round(-2.0f) returns " + round3 + " // Returns int");

        long round4 = (long)Math.round(-2.6);
        System.out.println("Math.round(-2.6) returns " + round4 + " // Returns long");

        long round5 = (long)Math.round(-2.4);
        System.out.println("Math.round(-2.4) returns " + round5 + " // Returns long");

    }
}
