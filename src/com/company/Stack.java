package com.company;

import java.util.ArrayList;

public class Stack {
    private ArrayList theList;

    public Stack() {
        theList = new ArrayList();
    }

    public void push(Object j) {
        theList.add(j);
    }

    public Object pop() {
        return theList.remove(theList.size() - 1);
    }

    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    public int countObj() {
        return theList.size();
    }

    public void clear() {
        theList.clear();
    }
}