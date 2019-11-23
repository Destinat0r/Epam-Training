public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        StringBuilder builder = new StringBuilder();

        if (arabicNumber == 0) {
            return getDefault();
        }

        if (arabicNumber >= 50) {
            builder.append("L");
            arabicNumber -= 50;
        }

        arabicNumber = appendDozens(arabicNumber, builder);
        arabicNumber = appendNineIfNeeded(arabicNumber, builder);
        arabicNumber = appendFourIfNeeded(arabicNumber, builder);
        arabicNumber = appendFiveIfNeeded(arabicNumber, builder);

        getRepeatingRomanNumber(arabicNumber, builder);

        return builder.toString();
    }

    private int appendNineIfNeeded(int arabicNumber, StringBuilder builder) {
        if (arabicNumber % 9 == 0 && arabicNumber > 0) {
            builder.append("IX");
            arabicNumber -= 9;
        }
        return arabicNumber;
    }

    private int appendFourIfNeeded(int arabicNumber, StringBuilder builder) {
        if (arabicNumber == 4) {
            builder.append("IV");
            arabicNumber -= 4;
        }
        return arabicNumber;
    }

    private int appendFiveIfNeeded(int arabicNumber, StringBuilder builder) {
        if (arabicNumber >= 5) {
            builder.append("V");
            arabicNumber -= 5;
        }
        return arabicNumber;
    }

    private int appendDozens(int arabicNumber, StringBuilder builder) {
        while (arabicNumber  >= 10) {
            builder.append("X");
            arabicNumber -= 10;
        }
        return arabicNumber;
    }

    private void getRepeatingRomanNumber(int arabicNumber, StringBuilder builder) {
        while (arabicNumber >= 1) {
            builder.append("I");
            arabicNumber--;
        }
    }

    private String getDefault() {
        return "";
    }
}
