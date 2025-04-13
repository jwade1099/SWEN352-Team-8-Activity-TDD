package edu.rit.swen352.tdd;

import java.util.Arrays;

/**
 * MyList is a flexible-sized sequence of elements with no gaps.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with varargs of initial elements</li>
 *   <li>add: add an element to the list; no-op if the element is already in the list (by reference)</li>
 *   <li>remove: remove an element by reference</li>
 *   <li>get: returns the element at a specific index;
 *     throw {@link java.util.NoSuchElementException} if the index is outside the size of the list</li>
 *   <li>isEmpty: queries if the list is empty</li>
 *   <li>size: queries how many elements in the list</li>
 *   <li>forEach: iterates over each element and executes the {@link java.util.function.Consumer} parameter</li>
 * </ul>
 *
 * @param <T> the type of elements in the list.
 */
public class MyList<T> {
    private T[] arr;

    public MyList(T... args){
        this.arr = args;
    }

    public T get(int i){
        if(i >= this.arr.length || i < 0) throw new java.util.NoSuchElementException();
        return this.arr[i];
    }

    public void add(T element){
        for(T e : this.arr){
            if(e == element) return;
        }
        this.arr = Arrays.copyOf(this.arr, this.arr.length + 1);
        this.arr[this.arr.length - 1] = element;
    }

    public void remove(T element){
        T[] newArr = Arrays.copyOf(arr, this.arr.length - 1);
        int arrCount = 0;
        boolean found = false;
        for(int i = 0; i < this.arr.length; i++){
            if(this.arr[i] == element){
                found = true;
                continue;
            }
            if(arrCount == this.arr.length - 1) continue;
            newArr[arrCount] = this.arr[i];
            arrCount++;
        }
        if(found) this.arr = newArr;
    }
}
