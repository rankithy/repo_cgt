package com.code;

public class CallGraphs
{
    public static void main(String[] args) {
        doStuff();
        System.out.println("success run");
    }

    public static void doStuff() {
        new A().foo();
        new B().fooB();
        new C().coo();
    }
}
