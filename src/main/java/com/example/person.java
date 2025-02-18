package com.example;

public class Person {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String gender;

    private Person(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    // Getters
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Integer getAge() { return age; }
    public String getGender() { return gender; }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id);
    }

    // Builder
    public static class Builder {
        private String id;
        private String firstName;
        private String lastName;
        private Integer age;
        private String gender;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            if (id == null) throw new IllegalArgumentException("ID cannot be null");
            if (firstName == null || firstName.isBlank()) throw new IllegalArgumentException("First name cannot be null or blank");
            if (lastName == null || lastName.isBlank()) throw new IllegalArgumentException("Last name cannot be null or blank");
            if (age != null && age < 0) throw new IllegalArgumentException("Age cannot be negative");

            return new Person(this);
        }
    }
}