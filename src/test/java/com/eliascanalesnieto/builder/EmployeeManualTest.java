package com.eliascanalesnieto.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeManualTest {

    @Test
    void constructorAndBuilderAreEquals() {
        final String passport = "passport";
        final String name = "name";
        final String lastName = "lastName";
        final String email = "email";
        final String school = "school";
        final float salary = 2.2f;
        assertEquals(new EmployeeManual(passport, name, lastName, email, school, salary),
                EmployeeManual.builder()
                        .passport(passport)
                        .name(name)
                        .lastName(lastName)
                        .email(email)
                        .school(school)
                        .salary(salary)
                        .build()
        );
    }

}
