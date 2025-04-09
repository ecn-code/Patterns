package com.eliascanalesnieto.builder;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString
public class Employee extends User {

    private final float salary;

    public Employee(final String passport, final String name, final String lastName, final String email,
                          final String school, final float salary) {
        super(passport, name, lastName, email, school);
        this.salary = salary;
    }
}
