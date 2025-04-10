package edu.rit.swen352.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
