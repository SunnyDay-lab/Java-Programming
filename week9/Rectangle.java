public class Rectangle {
        // Data fields
        private double width;
        private double height;

        // No-arg constructor that creates a default rectangle with width = 1 and height = 1
        public Rectangle() {
            this.width = 1.0;
            this.height = 1.0;
        }

        // Constructor that creates a rectangle with specified width and height
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Getter for width
        public double getWidth() {
            return width;
        }

        // Getter for height
        public double getHeight() {
            return height;
        }

        // Method to calculate the area of the rectangle
        public double getArea() {
            return width * height;
        }

        // Method to calculate the perimeter of the rectangle
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

