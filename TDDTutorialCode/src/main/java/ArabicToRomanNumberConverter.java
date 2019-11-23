import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanNumberConverter {

    private static StringBuilder builder;

    public String convert(int arabicNumber) {
        if (arabicNumber == 0) {
            return getDefault();
        }

        builder = new StringBuilder();
        Map<Integer, String> numberToSymbol = generateArabicToRomanMap();
        processArabicNumber(arabicNumber, numberToSymbol);

        return builder.toString();
    }

    private Map<Integer, String> generateArabicToRomanMap() {
        Map<Integer, String> arabicToRoman = new LinkedHashMap<>();

        arabicToRoman.put(1000, "M");
        arabicToRoman.put(500, "D");
        arabicToRoman.put(100, "C");
        arabicToRoman.put(50, "L");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(1, "I");

        return arabicToRoman;
    }

    private void processArabicNumber(int arabicNumber,
            Map<Integer, String> numberToSymbol) {

        for (int arabic : numberToSymbol.keySet()) {
            arabicNumber = appendNeededSymbols(arabic, numberToSymbol.get(arabic), arabicNumber);
        }
    }

    private int appendNeededSymbols(int number, String symbol, int arabicNumber) {
        while (arabicNumber >= number) {
            builder.append(symbol);
            arabicNumber -= number;
        }
        return arabicNumber;
    }

    private String getDefault() {
        return "";
    }
}
