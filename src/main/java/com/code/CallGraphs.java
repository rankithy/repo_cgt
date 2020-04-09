package com.code;

public class CallGraphs
{
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {
        new A().foo();
        new B().fooB();
    }
}

