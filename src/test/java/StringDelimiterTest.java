import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringcalculator.StringDelimiter;

public class StringDelimiterTest {

    @DisplayName("입력받은 문자열에서 커스텀 구분자를 추출")
    @Test
    void extraction(){
        StringDelimiter stringDelimiter = new StringDelimiter();
        String str = "//;\\n1;2;3";
        Assertions.assertThat(stringDelimiter.extraction(str)).isEqualTo(';');

        String str2 = "//%\\n1;2;3";
        Assertions.assertThat(stringDelimiter.extraction(str2)).isEqualTo('%');
    }
}
