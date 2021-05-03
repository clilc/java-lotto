import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringcalculator.Calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CalculatorTest {
    @DisplayName("추출된 숫자의 합 출력")
    @Test
    void add(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        Calculator calculator = new Calculator();
        Assertions.assertThat(calculator.add(numbers)).isEqualTo(6);
    }
}
