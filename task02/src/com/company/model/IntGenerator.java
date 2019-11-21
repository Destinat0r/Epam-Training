package com.company.model;

public class IntGenerator {

    private final int RAND_MAX = Integer.MAX_VALUE;
    private int max = RAND_MAX;
    private int min = 0;

    public IntGenerator() {}

    public IntGenerator(int min, int max) {
        this.min = min;
        this.max = max;

    }

    public int rand() {
        return (int) Math.random() * RAND_MAX + 1;
    }

    public int rand(int min, int max) {
        setMin(min);
        setMax(max);
        return (int) Math.random() * max + min + 1;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        checkRange(min, max);
        this.max = max;
    }

    public void checkRange(int min, int max) {
        if (min >= max || min < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        checkRange(min, max);
        this.min = min;
    }
}
