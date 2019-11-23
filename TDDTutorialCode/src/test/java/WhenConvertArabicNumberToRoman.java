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

    @Test
    public void convert_7_To_VII() {
        assertEquals("VII", converter.convert(7));
    }

    @Test
    public void convert_8_To_VIII() {
        assertEquals("VIII", converter.convert(8));
    }

    @Test
    public void convert_10_To_X() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    public void convert_20_To_XX() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    public void convert_4_To_IV() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    public void convert_9_To_IX() {
        assertEquals("IX", converter.convert(9));
    }

    @Test
    public void convert_14_To_XIV() {
        assertEquals("XIV", converter.convert(14));
    }

    @Test
    public void convert_39_To_XXXIX() {
        assertEquals("XXXIX", converter.convert(39));
    }

    @Test
    public void convert_44_To_XXXXIV() {
        assertEquals("XXXXIV", converter.convert(44));
    }

    @Test
    public void convert_50_To_L() {
        assertEquals("L", converter.convert(50));
    }

    @Test
    public void convert_77_To_LXXVII() {
        assertEquals("LXXVII", converter.convert(77));
    }

}

