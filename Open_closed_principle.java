//*************************************************************************
// TITLE : A JAVA PROGRAMME TO DEMOSTRATE OPEN-CLOSED PRINCIPLE .
// AUTHOR : MOZAZA AL ZAMAN, UNDERGRADUATE STUDENT (2ND YEAR) Of KHULNA UNIVERSITY
//*************************************************************************

/**
 * Represents a shape with a method to calculate its area.
 */
interface Shape {
    /**
     * Calculates the area of the shape.
     * 
     * @return the area of the shape
     */
    double calculateArea();
}

/**
 * Represents a rectangle with width and height.
 */
class Rectangle implements Shape {
    private double width;
    private double height;

    /**
     * Constructs a new Rectangle with the given width and height.
     * 
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

/**
 * Represents a circle with a radius.
 */
class Circle implements Shape {
    private double radius;

    /**
     * Constructs a new Circle with the given radius.
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Main class to demonstrate the Open-Closed Principle.
 */
public class OCPExample {
    /**
     * Calculates and prints the area of the given shapes.
     * 
     * @param shapes an array of shapes
     */
    public static void printArea(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }

    public static void main(String[] args) {
        // Create shapes
        Shape[] shapes = { new Rectangle(5, 4), new Circle(3) };

        // Print areas
        printArea(shapes);
    }
}
