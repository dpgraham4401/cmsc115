package com.vimpirate.week8;

/**
 * Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent
 * a rectangle. The class contains:
 * <p>
 * Two data fields named width and height.
 * A constructor that creates a rectangle with the specified width and height. The default values are 1 and 2
 * for the width and height, respectively.
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter.
 * Implement the class. Write a test program that creates two Rectangle objects—one with width 4 and height 40 and
 * the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
 */
public class Rectangle {
    private double width = 1;
    private double height = 2;

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width + width + height + height;
    }

    Rectangle() {
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
