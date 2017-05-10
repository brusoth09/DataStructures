package com.burusoth.dsa.stack;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayStackTest {
    @Test
    public void pushShouldInsertInTheTopOfDataStructure() throws Exception {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("First_String");
    }

    @Test
    public void pushShouldAcceptAnyElementIfNotExplicitlyDefined() throws Exception {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("First_String");
        arrayStack.push(1);
    }

    @Test
    public void pushShouldAcceptOnlyExplicitlyDefinedType() throws Exception {
        ArrayStack<String> arrayStack = new ArrayStack<String>();
        arrayStack.push("Hello");
        arrayStack.push("Only String");

    }

    @Test
    public void peekElementShouldGiveLastInsertedElement() throws Exception {
        ArrayStack<String> arrayStack = new ArrayStack<String>();
        arrayStack.push("First Element");
        arrayStack.push("Second Element");
        arrayStack.push("Last Element");
        assertEquals(arrayStack.peek(), "Last Element");
    }

    @Test(expected = EmptyStackException.class)
    public void peekShouldThrowEmptyStackExceptionwhenStackIsEmpty() throws Exception {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.peek();
    }

    @Test
    public void popShouldReturnLAstElementAndRemovesIt() throws Exception {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("First Element");
        arrayStack.push("Last Element");
        assertEquals(arrayStack.pop(), "Last Element");
        assertEquals(arrayStack.peek(), "First Element");
    }

    @Test(expected = EmptyStackException.class)
    public void popShouldThrowEmptyStackExceptionWhenEmpty() throws Exception {
        ArrayStack  arrayStack = new ArrayStack();
        arrayStack.pop();

    }
}
