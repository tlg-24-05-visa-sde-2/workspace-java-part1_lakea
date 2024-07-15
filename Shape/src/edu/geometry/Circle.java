package edu.geometry;

/*
 * Represents a circle shape with a radius.
 */
public record Circle(double radius) implements Shape {

    /*
     * Constructs a circle with the specified radius.
     * @throws IllegalArgumentException if radius is non-positive
     */
    public Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
    }

    /*
     * Calculates and returns the area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Gets the radius of the circle.
     */
    @Override
    public double radius() {
        return radius;
    }
}