package stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringDelimiter {
    private static final String DEFAULT_DELIMITER = ";|,";

    private String customDelimiter;

    public void extraction(String str) {
        if (str.split("//").length >= 2) {
            this.customDelimiter = str.split("//")[1].split("\\\\n")[0];
        }
    }

    public String remove(String str) {
        return str.split("\\\\n")[1];
    }

    public List<Integer> customSplit(String str) {
        String[] split = str.split(customDelimiter);
        List<Integer> numbers = new ArrayList<>();
        //@\n1@2;3
        for (String s : split) {
            if (Pattern.matches("[0-9]*$", s)) {
                Arrays.asList(numbers.add(Integer.parseInt(s)));
            }
            if (!Pattern.matches("[0-9]*$", s)) {
                String[] split1 = s.split(DEFAULT_DELIMITER);
                for (String g : split1) {
                    Arrays.asList(numbers.add(Integer.parseInt(g)));
                }
            }
        }
        return numbers;
    }

    public List<Integer> defaultSplit(String str) {
        List<String> string1 = Arrays.asList(str.split(DEFAULT_DELIMITER));
//        String join = String.join("", string1);
//        List<String> string2 = Arrays.asList(join.split(""));
        List<Integer> result = new ArrayList<>();
        for (String s : string1) {
            if (!Pattern.matches("[0-9]*$", s))
                throw new RuntimeException("오류");
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    public String getCustomDelimiter() {
        return customDelimiter;
    }
}

