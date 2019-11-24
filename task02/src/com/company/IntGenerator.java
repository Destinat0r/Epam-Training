package com.company;

public class IntGenerator {

    private final static int RAND_MAX = Integer.MAX_VALUE;

    public static int rand() {
        return rand(0, RAND_MAX);
    }

    public static int rand(int min, int max) {
        validateRange(min, max);
        return (int) Math.ceil(Math.random() * (max - min - 1) + min);
    }

    public static void validateRange(int min, int max) {
        if (min >= max || min < 0) {
            throw new IllegalArgumentException();
        }
    }
}
