package edu.geometry;

/*
 * Represents a triangle shape with base and height dimensions.
 */
public class Triangle implements Shape {
    private double base;
    private double height;

    /*
     * Constructs a triangle with the specified base and height.
     * @throws IllegalArgumentException if base or height is non-positive
     */
    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers.");
        }
        this.base = base;
        this.height = height;
    }

    /*
     * Calculates and returns the area of the triangle.
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /*
     * Gets the base length of the triangle.
     */
    public double getBase() {
        return base;
    }

    /*
     * Gets the height of the triangle.
     */
    public double getHeight() {
        return height;
    }
}