package stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDelimiter {
    private static final int EXTRACTION_NUMBER = 2;

    public String extraction(String str) {
        return str.split("//")[1].split("\\\\n")[0];
    }

    public String remove(String str) {
        return str.split("\\\\n")[1];
    }

    public List<Integer> customSplit(String str, String delimiter) {
        String[] split = str.split(delimiter);
        List<Integer> numbers = new ArrayList<>();
        for(String s:split){
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}