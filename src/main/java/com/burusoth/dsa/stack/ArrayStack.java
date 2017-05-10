package com.burusoth.dsa.stack;


import java.util.Arrays;

public class ArrayStack<E>{

    private Object[] elements;
    private int size = 0;
    private int MAX_SIZE = 10;

    public ArrayStack() {
       elements = new Object[MAX_SIZE];
    }

    public void push(E element) {
        if(size == MAX_SIZE){
            resizeArray();
        }
        elements[size++] = element;
    }


    private void resizeArray() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E peek() throws EmptyStackException {
        if(size == 0){
            throw new EmptyStackException("Empty Stack");
        }
        return (E) elements[size - 1];
    }

    public E pop() throws EmptyStackException {
        if(size == 0){
            throw new EmptyStackException("Empty Stack");
        }
        return (E) elements[--size];
    }
}
