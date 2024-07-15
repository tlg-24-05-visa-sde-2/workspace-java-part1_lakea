package edu.geometry;

/*
 * Represents a rectangle shape with a given length and width.
 */
public class Rectangle implements Shape {
    private int length;
    private int width;

    /*
     * Constructs a rectangle with the specified length and width.
     * @throws IllegalArgumentException if length or width is non-positive
     */
    public Rectangle(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive integers.");
        }
        this.length = length;
        this.width = width;
    }

    /*
     * Calculates and returns the area of the rectangle.
     */
    @Override
    public double getArea() {
        return length * width;
    }

    /*
     * Gets the length of the rectangle.
     */
    public int getLength() {
        return length;
    }

    /*
     * Gets the width of the rectangle.
     */
    public int getWidth() {
        return width;
    }
}