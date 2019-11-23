import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRoman {
    private ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();

    @Test
    public void convert_0_To_EmptyString() {
        assertEquals("", converter.convert(0));
    }

    @Test
    public void convert_1_To_I() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void convert_2_To_II() {
        assertEquals("II", converter.convert(2));
    }

    @Test
    public void convert_3_To_III() {
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void convert_5_To_V() {
        assertEquals("V", converter.convert(5));
    }

    @Test
    public void convert_6_To_VI() {
        assertEquals("VI", converter.convert(6));
    }

}

