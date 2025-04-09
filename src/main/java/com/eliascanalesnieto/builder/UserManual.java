package com.eliascanalesnieto.builder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class UserManual {

    private final String passport;
    private final String name;
    private final String lastName;
    private final String email;
    private final String school;

    public UserManual(final String passport, final String name, final String lastName, final String email,
                      final String school) {
        this.passport = passport;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.school = school;
    }

    public UserManual(final Builder builder) {
        this.passport = builder.passport;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.school = builder.school;
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static class Builder<T extends UserManual.Builder<T>> {
        protected String passport;
        protected String name;
        protected String lastName;
        protected String email;

        //Default value
        private String school = "<None>";

        protected Builder(){}

        public T passport(final String passport) {
            this.passport = passport;
            return self();
        }

        public T name(final String name) {
            this.name = name;
            return self();
        }

        public T lastName(final String lastName) {
            this.lastName = lastName;
            return self();
        }

        public T email(final String email) {
            this.email = email;
            return self();
        }

        public T school(final String school) {
            this.school = school;
            return self();
        }

        public UserManual build() {
            return new UserManual(this);
        }

        public T self() {
            return (T) this;
        }
    }

}
