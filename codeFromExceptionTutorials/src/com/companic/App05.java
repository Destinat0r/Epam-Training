package com.companic;

import java.io.IOException;

public class App05 {
    public static void main(String[] args) throws IOException {
        try {
            int area = area(-10, 20);
        } catch (IllegalArgumentException e) {
            System.out.println("bad...");
        }
        System.out.println("next");
    }

    public static int area(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a < 0 || b < 0 == true");
        }
        return a * b;
    }
}
