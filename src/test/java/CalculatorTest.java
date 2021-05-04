import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringcalculator.Calculator;

import java.io.BufferedInputStream;
import java.nio.Buffer;
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

    @DisplayName("문자열 계산기 실행")
    @Test
    void execute(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        Calculator calculator = new Calculator();
        calculator.execute();
        Assertions.assertThat(calculator.add(numbers)).isEqualTo(6);
    }

    @Test
    void name() {
        //BufferedInputStream bufferedInputStream = new BufferedInputStream();
    }
}
