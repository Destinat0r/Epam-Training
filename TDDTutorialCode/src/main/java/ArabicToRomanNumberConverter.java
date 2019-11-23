public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        StringBuilder builder = new StringBuilder();

        getRepeatingRomanNumber(arabicNumber, builder);

        return builder.toString();
    }

    private void getRepeatingRomanNumber(int arabicNumber, StringBuilder builder) {
        while (arabicNumber-- >= 1) {
            builder.append("I");
        }
    }

    private String getDefault() {
        return "";
    }
}
