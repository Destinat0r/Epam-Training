import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        if (arabicNumber == 0) {
            return getDefault();
        }
        StringBuilder builder = new StringBuilder();

        Map<Integer, String> numberToSymbol = generateArabicToRomanMap();

        for (int arabic : numberToSymbol.keySet()) {
            arabicNumber = appendSymbolsForNumber(arabic, numberToSymbol.get(arabic), arabicNumber, builder);
        }

        return builder.toString();
    }

    private Map<Integer, String> generateArabicToRomanMap() {
        Map<Integer, String> arabicToRoman = new LinkedHashMap<>();

        arabicToRoman.put(100, "C");
        arabicToRoman.put(50, "L");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(1, "I");

        return arabicToRoman;
    }

    private int appendSymbolsForNumber(int number, String symbol, int arabicNumber, StringBuilder builder) {
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
