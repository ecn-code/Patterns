package com.eliascanalesnieto.singleton;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void whenCallTwoTimesHasTheSameInstance() {
        assertSame(Singleton.INSTANCE, Singleton.INSTANCE);
    }

    @Test
    @SneakyThrows
    void serialization() {
        Singleton original = Singleton.INSTANCE;

        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        Singleton deserialized = (Singleton) in.readObject();
        in.close();

        assertSame(original, deserialized);
    }

    @Test
    @SneakyThrows
    void whenCallConstructorThrowsException() {
        final Class<Singleton> clazz = Singleton.class;
        final Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

}