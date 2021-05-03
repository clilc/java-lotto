package stringcalculator;

import java.util.List;

public class Calculator {
    public int add(List<Integer> numbers) {
        int result = 0;
        for (int number:numbers){
            result+=number;
        }
        return result;
    }
}
