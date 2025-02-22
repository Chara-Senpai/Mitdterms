class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void printRectangleInfo() {
        System.out.println("Rectangle with width " + width + " and height " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 9);
        
        Rectangle rectangle2 = new Rectangle(6, 9);

        System.out.println("Details of Rectangle 1:");
        rectangle1.printRectangleInfo();
        
        System.out.println("\nDetails of Rectangle 2:");
        rectangle2.printRectangleInfo();
    }
}
