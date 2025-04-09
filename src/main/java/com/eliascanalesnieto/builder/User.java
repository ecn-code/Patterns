package com.eliascanalesnieto.builder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode
public class User {

    private final String passport;
    private final String name;
    private final String lastName;
    private final String email;
    private final String school;

}
