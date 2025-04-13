package edu.rit.swen352.tdd;


/**
 * Calculator is a flexible calculator object.
 *
 * <ul>
 *   <li>add: take varargs floats and add them together</li>
 *   <li>subtract: take a float and varargs floats and subtract them from the first value</li>
 *   <li>multiply: take varargs floats and multiply them together</li>
 *   <li>subtract: take a float and varargs floats and divide the first value by them</li>
 * </ul>
 */
public class Calculator {
    public float add(float ...values){
        float sum = 0;
        for(float value : values) sum += value;
        return sum;
    }
}
