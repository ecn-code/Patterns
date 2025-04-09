package com.eliascanalesnieto.builder;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class EmployeeManual extends UserManual {

    private final float salary;

    public EmployeeManual(final Builder builder) {
        super(builder);
        this.salary = builder.salary;
    }

    public EmployeeManual(final String passport, final String name, final String lastName, final String email,
                      final String school, final float salary) {
        super(passport, name, lastName, email, school);
        this.salary = salary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends UserManual.Builder<Builder> {

        private float salary;

        public Builder salary(final float salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public EmployeeManual build() {
            return new EmployeeManual(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }
}
