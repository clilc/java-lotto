package lotto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LottoTest {

    @DisplayName("로또를 한장 구매하는데 천원")
    @Test
    void lottoPrice(){
        Lotto lotto = new Lotto();
        int balance = 10000;
        int quantity = 5;

        Assertions.assertThat(lotto.payment(balance, quantity)).isEqualTo(5000);
    }
}
