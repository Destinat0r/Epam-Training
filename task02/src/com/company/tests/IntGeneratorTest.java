package com.company.tests;

import com.company.model.IntGenerator;
import org.junit.Assert;
import org.junit.Test;

public class IntGeneratorTest {

    private IntGenerator generator = new IntGenerator();

    @Test
    public void shouldHandleDefaultRange() {
        for (int i = 0; i < 1000; i++) {
            Assert.assertTrue("Should be in range from 0 to " + generator.getMax(),
                    isInRange(generator.rand(), 0, generator.getMax()));
        }
    }

    private boolean isInRange(int randomInt, int min, int max) {
        return randomInt >= min && randomInt <= max;
    }

    @Test
    public void shouldWorkInRange_0_to_100() {
        generator.setMin(0);
        generator.setMax(100);

        for (int i = 0; i < 1000; i++) {
            Assert.assertTrue("Should be in range from 0 to " + generator.getMax(),
                    isInRange(generator.rand(), 0, generator.getMax()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException_when_MinIsSetBiggerThanMax() {
        generator.setMin(20);
        generator.setMax(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException_when_MinEqualsMax() {
        generator.setMax(55);
        generator.setMin(55);
    }


}
