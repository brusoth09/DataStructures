package com.burusoth.dsa.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {
    /**
     * custom stack implementation without using java stack implementation.
     * push should insert in the top of data structure
     */
    @Test
    public void pushShouldInsertInTheTopOfDataStructure() throws Exception {
        CustomStack customStack = new CustomStack();
        customStack.push("First_String");
    }

    @Test
    public void pushShouldAcceptAnyElementIfNotExplicitlyDefined() throws Exception {
        CustomStack customStack = new CustomStack();
        customStack.push("First_String");
        customStack.push(1);
    }

    @Test
    public void pushShouldAcceptOnlyExplicitlyDefinedType() throws Exception {
        CustomStack<String> customStack = new CustomStack<String>();
        customStack.push("Hello");
        customStack.push("Only String");

    }

    @Test
    public void peekElementShouldGiveLastInsertedElement() throws Exception {
        CustomStack<String> customStack = new CustomStack<String>();
        customStack.push("First Element");
        customStack.push("Second Element");
        customStack.push("Last Element");
        assertEquals(customStack.peek(), "Last Element");
    }

    @Test(expected = EmptyStackException.class)
    public void peekShouldThrowEmptyStackExceptionwhenStackIsEmpty() throws Exception {
        CustomStack customStack = new CustomStack();
        customStack.peek();
    }

    @Test
    public void popShouldReturnLAstElementAndRemovesIt() throws Exception {
        CustomStack customStack = new CustomStack();
        customStack.push("First Element");
        customStack.push("Last Element");
        assertEquals(customStack.pop(), "Last Element");
        assertEquals(customStack.peek(), "First Element");
    }

    @Test(expected = EmptyStackException.class)
    public void popShouldThrowEmptyStackExceptionWhenEmpty() throws Exception {
        CustomStack  customStack = new CustomStack();
        customStack.pop();

    }
}
