package edu.rit.swen352.tdd;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * MyStack is a fixed-size, LIFO (last-in-first-out) stack.
 * @see <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">Stack ADT</a>
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with and without the capacity (defaults to 16)</li>
 *   <li>push: add an element to the stack; throw {@link IllegalStateException} if the stack is full</li>
 *   <li>pop: remove and return the top element of the stack; throw {@link java.util.NoSuchElementException} if the stack is empty</li>
 *   <li>isEmpty: queries if the stack is empty</li>
 *   <li>size: queries how many elements in the stack</li>
 * </ul>
 *
 * @param <T> the type of elements in the stack.
 */
public class MyStack<T> {
    private int capacity;
    private int[] array;
    private int top;

    public MyStack(int capacity) {
        this.capacity = capacity;
        //T[] array = Arrays.copyOf(arr, capacity); GENERIC TYPE ARRAYS CONFUSING ME
        array = new int[capacity];
        this.top = 0;
    }

    public MyStack() {
        this.capacity = 16;
        array = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void push(int element) {
        array[top] = element;
        top++;

        if (top == 0) {
            throw new IllegalStateException() ;
        }
        
    }

}
