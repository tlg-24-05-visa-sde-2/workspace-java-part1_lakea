package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Triangle;

class ShapeClient {
    public static void main(String[] args) {

        // Create a rectangle with length 5 and width 3
        Rectangle rectangle = new Rectangle(5, 3);

        // Print the dimensions
        System.out.println("Rectangle Length: " + rectangle.getLength());
        System.out.println("Rectangle Width: " + rectangle.getWidth());

        // Calculate and print the area
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println();


        // Create a triangle with base 5 and height 3
        Triangle triangle = new Triangle(5, 3);

        // Print the base and height
        System.out.println("Triangle Base: " + triangle.getBase());
        System.out.println("Triangle Height: " + triangle.getHeight());

        // Calculate and print the area
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println();

        // Create a circle with radius 4.5
        Circle circle = new Circle(4.5);

        // Print the radius
        System.out.println("Circle Radius: " + circle.radius());

        // Calculate and print the area
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println();
    }
}
