package com.eliascanalesnieto.staticfactorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class ShapeTest {

    @Test
    void whenRectangleHas10x10ThenReturnStatic() {
        assertSame(Shape.getInstance(10, 10), Shape.getInstance(10, 10));
    }

    @Test
    void whenRectangleHasNot10x10ThenReturnNewInstance() {
        assertNotSame(Shape.getInstance(11, 110), Shape.getInstance(11, 110));
    }

    @Test
    void rectangleAndSquareAreNotTheSameClass() {
        final Class<? extends Shape> rectangle = Shape.getInstance(10, 100).getClass();
        final Class<? extends Shape> square = Shape.getInstance(10, 10).getClass();

        assertEquals(rectangle.getCanonicalName(), "com.eliascanalesnieto.staticfactorymethod.Shape.Rectangle");
        assertEquals(square.getCanonicalName(), "com.eliascanalesnieto.staticfactorymethod.Shape.Square");
        assertNotSame(rectangle, square);
    }

}