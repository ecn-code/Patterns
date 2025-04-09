package com.eliascanalesnieto.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserManualTest {

    @Test
    void constructorAndBuilderAreEquals() {
        final String passport = "passport";
        final String name = "name";
        final String lastName = "lastName";
        final String email = "email";
        final String school = "school";
        assertEquals(new UserManual(passport, name, lastName, email, school),
                UserManual.builder()
                        .passport(passport)
                        .name(name)
                        .lastName(lastName)
                        .email(email)
                        .school(school)
                        .build()
        );
    }

}
