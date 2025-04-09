package com.eliascanalesnieto.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void constructorAndBuilderAreEquals() {
        final String passport = "passport";
        final String name = "name";
        final String lastName = "lastName";
        final String email = "email";
        final String school = "school";
        final float salary = 2.2f;
        assertEquals(new Employee(passport, name, lastName, email, school, salary),
                Employee.builder()
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
