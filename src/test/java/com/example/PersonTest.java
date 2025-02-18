package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testValidPerson() {
        Person person = new Person.Builder()
                .id("123")
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .gender("Male")
                .build();
        assertNotNull(person);
    }

    @Test
    void testInvalidPerson() {
        assertThrows(IllegalArgumentException.class, () -> new Person.Builder()
                .id(null)
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .gender("Male")
                .build());
    }
}