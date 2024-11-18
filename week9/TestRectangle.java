public class TestRectangle {
    public static void main(String[] args) {
        // Create two Rectangle objects with specified dimensions
        Rectangle rect1 = new Rectangle(4.0, 40.0);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // Display the width, height, area, and perimeter of the first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Display the width, height, area, and perimeter of the second rectangle
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}

