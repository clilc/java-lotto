package lotto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RandomNumberTest {
    @DisplayName("로또 한장을 구입하면 1~45중 중복되지 않은 6개 숫자 생성")
    @Test
    void randomNumber() {
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> randomNumbers = randomNumber.generateRandomNumbers();
        System.out.println(randomNumbers);
        Assertions.assertThat(randomNumbers.size()).isEqualTo(6);
    }
}
