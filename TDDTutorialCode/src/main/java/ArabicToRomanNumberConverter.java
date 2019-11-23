public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        }
        return getDefault();
    }

    private String getDefault() {
        return "";
    }
}
