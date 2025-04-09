package com.eliascanalesnieto.staticfactorymethod;

/**
 * Advantages of using a static factory method:
 *  - Allows returning objects of hidden or private classes.
 *  - Can return instances of subclasses based on input parameters.
 *  - Enables object reuse by returning pre-constructed instances (e.g., singletons or cached objects).
 *  - Improves readability by replacing ambiguous constructors with clearly named methods.
 */
public abstract class Shape {

    public static Shape getInstance(final int width, final int height) {
        if(width == height) {
            return Square.fromWidthAndHeight(width, height);
        }

        return new Rectangle(width, height);
    }

    public abstract String print();

    //Simulates private package class
    private static class Rectangle extends Shape {

        private final int width;
        private final int height;

        private Rectangle(final int width, final int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String print() {
            return "Width: " + width + ", Height: " + height;
        }
    }

    private static class Square extends Rectangle {

        private static final Square DEFAULT = new Square(10, 10);

        private Square(final int width, final int height) {
            super(width, height);
        }

        private static Square fromWidthAndHeight(final int width, final int height) {
            if(width == 10 && height == 10) {
                return DEFAULT;
            }

            return new Square(width, height);
        }

    }
}
