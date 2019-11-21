package com.company.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Model {

    public static IntGenerator generator;
    private List<Integer> stats;

    public Model() {
        this.generator = new IntGenerator(0, 100);
        this.stats = new ArrayList<>();
    }

    public List<Integer> getStats() {
        return stats;
    }

    public void addToStats(int guess) {
        this.stats.add(guess);
    }
}
