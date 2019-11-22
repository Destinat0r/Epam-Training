package com.company.tests;

import com.company.model.IntGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntGeneratorTest {

    @Test public void generatesDifferentNumbers() {
        Set<Integer> results = new HashSet<>();
        int i = 0;
        for (; i < 100; i++) {
            results.add(IntGenerator.rand(0, 100));
        }
        Assert.assertTrue("Should unique nums", results.size() > 1);
    }
}
