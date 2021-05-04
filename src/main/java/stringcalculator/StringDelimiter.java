package stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringDelimiter {
    private static final String DEFAULT_DELIMITER = ";|,";

    private String customDelimiter;

    public void extraction(String formula) {
        if (formula.split("//").length >= 2) {
            this.customDelimiter = formula.split("//")[1].split("\\\\n")[0];
        }
    }

    public String remove(String formula) {
        return formula.split("\\\\n")[1];
    }

    public List<Integer> customSplit(String formula) {
        String[] splitFormula = formula.split(customDelimiter);
        List<Integer> numbers = new ArrayList<>();

        for (String splitValue : splitFormula) {
            if (Pattern.matches("[0-9]*$", splitValue)) {
                Arrays.asList(numbers.add(Integer.parseInt(splitValue)));
            }
            if (!Pattern.matches("[0-9]*$", splitValue)) {
                String[] split1 = splitValue.split(DEFAULT_DELIMITER);
                for (String g : split1) {
                    Arrays.asList(numbers.add(Integer.parseInt(g)));
                }
            }
        }
        return numbers;
    }

    public List<Integer> defaultSplit(String formula) {
        List<String> splitFormula = Arrays.asList(formula.split(DEFAULT_DELIMITER));
        List<Integer> result = new ArrayList<>();
        for (String splitValue : splitFormula) {
            if (!Pattern.matches("[0-9]*$", splitValue))
                throw new RuntimeException("오류");
            result.add(Integer.parseInt(splitValue));
        }
        return result;
    }

    public String getCustomDelimiter() {
        return customDelimiter;
    }
}

