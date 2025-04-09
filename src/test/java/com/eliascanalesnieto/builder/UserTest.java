package com.eliascanalesnieto.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void constructorAndBuilderAreEquals() {
        final String passport = "passport";
        final String name = "name";
        final String lastName = "lastName";
        final String email = "email";
        final String school = "school";
        assertEquals(new User(passport, name, lastName, email, school),
                User.builder()
                        .passport(passport)
                        .name(name)
                        .lastName(lastName)
                        .email(email)
                        .school(school)
                        .build()
        );
    }

}