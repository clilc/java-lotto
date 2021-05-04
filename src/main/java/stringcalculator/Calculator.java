package stringcalculator;

import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static final String INPUT_FORMULA = "계산식을 입력해주세요.";

    public int add(List<Integer> numbers) {
        int result = 0;
        for (int number:numbers){
            result+=number;
        }
        return result;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String  formula = scanner.nextLine();
        List<Integer> numbers = null;
        
        System.out.println("formula = " + formula);
        StringDelimiter stringDelimiter = new StringDelimiter();
        stringDelimiter.extraction(formula);

        if(stringDelimiter.getCustomDelimiter() != null){
            System.out.println("stringDelimiter.getCustomDelimiter() = " + stringDelimiter.getCustomDelimiter());
            formula = stringDelimiter.remove(formula);
            numbers = stringDelimiter.customSplit(formula);
            System.out.println("numbers = " + numbers);
        }

        if(stringDelimiter.getCustomDelimiter() == null){
            numbers = stringDelimiter.defaultSplit(formula);
        }
        System.out.println("sum = " + add(numbers));
    }
}

