package com.companic;

public class App00_$_ {
    public static void main(String[] args) {
        System.err.println("f:before");
        f();
        System.err.println("f:after");
    }

    private static void f() {
        System.err.println("g:before");
        g();
        System.err.println("g:after");
    }

    private static void g() {
//        return;
        throw new RuntimeException();
    }
}
