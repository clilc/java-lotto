package stringcalculator;

public class StringDelimiter {
    private static final int EXTRACTION_NUMBER = 2;

    public String extraction(String str) {
        return str.split("//")[1].split("\\\\n")[0];
    }

    public String remove(String str) {
        return str.split("\\\\n")[1];
    }
}