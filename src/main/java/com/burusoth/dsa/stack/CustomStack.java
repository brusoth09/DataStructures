package com.burusoth.dsa.stack;


import java.util.LinkedList;
import java.util.List;

public class CustomStack<T> {
    private List<T> list;

    public CustomStack() {
        list = new LinkedList();
    }

    public void push(T element){
        list.add(element);
    }

    public T peek() throws EmptyStackException {
        if(list == null || list.isEmpty()){
            throw new EmptyStackException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public T pop() throws EmptyStackException {
        if(list == null || list.isEmpty()){
            throw new EmptyStackException("Stack is empty");
        }
        T lastElement = list.get(list.size() - 1);
        list.remove(lastElement);
        return lastElement;
    }
}
