package edu.rit.swen352.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyOptional} component.
 */
class MyOptionalTest {
    @Test
    void emptyReturnsEmptyOptional() {
        MyOptional<String> optional = MyOptional.empty();

        assertFalse(optional.isPresent());
    }

    @DisplayName("Creating an optional with a non-null value")
    @Test
    void ofNonNull() {
        MyOptional<String> optional = MyOptional.of("hello");

        assertTrue(optional.isPresent());
    }

    @DisplayName("Creation of a null value in an optional should through a NPE")
    @Test
    void ofNull() {
        assertThrows(NullPointerException.class, () -> MyOptional.of(null));
    }

    @DisplayName("ofNullable with non null value, will return nonNull optional")
    @Test
    void ofNullableNonNull() {
        MyOptional<String> optional = MyOptional.ofNullable("hello");

        assertTrue(optional.isPresent());
    }

    @DisplayName("ofNullable with non null value, will return empty optional")
    @Test
    void ofNullableNull() {
        MyOptional<String> optional = MyOptional.ofNullable(null);

        assertFalse(optional.isPresent());
    }

    @DisplayName("Test for optional get method when has value, should return the value")
    @Test
    void getValuePresent() {
        MyOptional<String> optional = MyOptional.of("value");

        assertEquals("value", optional.get());
    }

    @DisplayName("Test for optional get method when empty, should throw a NSE")
    @Test
    void getValueEmpty() {
        MyOptional<String> optional = MyOptional.empty();

        assertThrows(NoSuchElementException.class, optional.get());
    }
}
