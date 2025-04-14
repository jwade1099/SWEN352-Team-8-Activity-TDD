package edu.rit.swen352.tdd;

import edu.rit.swen352.tdd.MyStack;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@link MyStack} component.
 */
class MyStackTest {


    @Test
    void testConstructorCapacity() {
        int capacity = 9;
        MyStack<Integer> stack = new MyStack<>(capacity);
        assertEquals(capacity, stack.getCapacity());
    }

    @Test
    void testConstructorNoCapacity() {
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(16, stack.getCapacity());
    }


}
