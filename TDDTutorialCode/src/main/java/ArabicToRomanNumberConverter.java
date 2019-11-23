public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        StringBuilder output = new StringBuilder();

        if (arabicNumber > 0 && arabicNumber <= 3) {
            while (arabicNumber-- > 0) {
                output.append("I");
            }
        }

        return output.toString();
    }

    private String getDefault() {
        return "";
    }
}
