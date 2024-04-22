//*************************************************************************
// TITLE : A JAVA PROGRAMME TO DEMOSTRATE LISKOV SUBSTITUTION PRINCIPLE .
// AUTHOR : MOZAZA AL ZAMAN, UNDERGRADUATE STUDENT (2ND YEAR) Of KHULNA UNIVERSITY
//*************************************************************************

/**
 * Represents a shape with width and height.
 */
class Shape {
    protected int width;
    protected int height;

    /**
     * Constructs a new shape with the given width and height.
     * 
     * @param width  the width of the shape
     * @param height the height of the shape
     */
    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the area of the shape.
     * 
     * @return the area of the shape
     */
    public int getArea() {
        return width * height;
    }
}

/**
 * Represents a rectangle.
 */
class Rectangle extends Shape {
    /**
     * Constructs a new rectangle with the given width and height.
     * 
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(int width, int height) {
        super(width, height);
    }
}

/**
 * Represents a square.
 */
class Square extends Shape {
    /**
     * Constructs a new square with the given side length.
     * 
     * @param side the side length of the square
     */
    public Square(int side) {
        super(side, side);
    }
}

/**
 * Main class to demonstrate the Liskov Substitution Principle.
 */
public class LSPExample {
    /**
     * Prints the area of the given shape.
     * 
     * @param shape the shape to print the area for
     */
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(4, 5);
        printArea(rectangle);

        // Create a square
        Square square = new Square(4);
        printArea(square);
    }
}
