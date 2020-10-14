package com.company;

public class Main {

    public static void main(String[] args) {
        final Stack stack = new Stack();
        final SystemCore systemCore = new SystemCore(stack);

        systemCore.getListOfSysCalls();

        stack.push("hello!");
        stack.push(8.4);
        systemCore.systemCall(0);

        stack.push(5);
        stack.push(7);
        systemCore.systemCall(1);

        stack.push(4);
        stack.push("How are you?");
        systemCore.systemCall(1);

        stack.push(6.5);
        stack.push(9);
        systemCore.systemCall(2);

        stack.push("Привет!");
        stack.push(5.5);
        systemCore.systemCall(0);

        stack.push(3);
        stack.push(3.5);
        systemCore.systemCall(3);

        systemCore.systemCall(0);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        systemCore.systemCall(4);

        stack.push("строка");
        stack.push("строка");
        stack.push("строка");
        systemCore.systemCall(5);

        stack.push("строка1");
        stack.push("строка2");
        stack.push("строка3");
        stack.push("строка4");
        systemCore.systemCall(3);
    }
}