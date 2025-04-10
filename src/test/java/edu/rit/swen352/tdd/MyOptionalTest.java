package edu.rit.swen352.tdd;

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

}
