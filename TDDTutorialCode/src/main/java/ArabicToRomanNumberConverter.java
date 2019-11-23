public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        StringBuilder builder = new StringBuilder();

        if (arabicNumber == 0) {
            return getDefault();
        }

        arabicNumber = appendHundreds(arabicNumber, builder);
        arabicNumber = appendFiftyIfNeeded(arabicNumber, builder);
        arabicNumber = appendDozens(arabicNumber, builder);
        arabicNumber = appendNineIfNeeded(arabicNumber, builder);
        arabicNumber = appendFiveIfNeeded(arabicNumber, builder);
        arabicNumber = appendFourIfNeeded(arabicNumber, builder);

        getRepeatingRomanNumber(arabicNumber, builder);

        return builder.toString();
    }

    private int appendHundreds(int arabicNumber, StringBuilder builder) {
        return appendSymbolsForNumber(100, "C", arabicNumber, builder);
    }

    private int appendSymbolsForNumber(int number, String symbol, int arabicNumber, StringBuilder builder) {
        while (arabicNumber >= number) {
            builder.append(symbol);
            arabicNumber -= number;
        }
        return arabicNumber;
    }

    private int appendFiftyIfNeeded(int arabicNumber, StringBuilder builder) {
        return appendSymbolsForNumber(50, "L", arabicNumber, builder);
    }

    private int appendNineIfNeeded(int arabicNumber, StringBuilder builder) {
        return appendSymbolsForNumber(9, "IX", arabicNumber, builder);
    }

    private int appendFourIfNeeded(int arabicNumber, StringBuilder builder) {
        return appendSymbolsForNumber(4, "IV", arabicNumber, builder);
    }

    private int appendFiveIfNeeded(int arabicNumber, StringBuilder builder) {
        return appendSymbolsForNumber(5, "V", arabicNumber, builder);
    }

    private int appendDozens(int arabicNumber, StringBuilder builder) {
        return appendSymbolsForNumber(10, "X", arabicNumber, builder);
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
