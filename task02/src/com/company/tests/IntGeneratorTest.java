package com.company.tests;

import com.company.IntGenerator;
import com.company.Model;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntGeneratorTest {

    @Test
    public void shouldCorrectlyGenerateIntFrom_0to100_For_100_000_Times() {
        Model model = new Model();

        for (int i = 0; i <= 100_000; i++) {
            int randInt = IntGenerator.rand(0, 100);
            assertTrue("Int should be in range ", model.isInRange(randInt));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrow_IllegalArgumentException_whenNegativeMin() {
        IntGenerator.rand(-1, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrow_IllegalArgumentException_whenNegativeMax() {
        IntGenerator.rand(-1000, -100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrow_IllegalArgumentException_whenMinBiggerThanMax() {
        IntGenerator.rand(40,20);
    }
}
