import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRoman {

    @Test
    public void convert_0_To_EmptyString() {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.convert(0);

        assertEquals("", romanNumber);
    }
}
