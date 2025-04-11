package com.eliascanalesnieto.singleton;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEnumTest {

    @Test
    void whenCallTwoTimesHasTheSameInstance() {
        assertSame(SingletonEnum.INSTANCE, SingletonEnum.INSTANCE);
    }

    @Test
    @SneakyThrows
    void serialization() {
        final SingletonEnum original = SingletonEnum.INSTANCE;

        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
        out.writeObject(original);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        SingletonEnum deserialized = (SingletonEnum) in.readObject();
        in.close();

        assertSame(original, deserialized);
    }

}