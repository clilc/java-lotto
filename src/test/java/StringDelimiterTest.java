//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import stringcalculator.StringDelimiter;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class StringDelimiterTest {
//
//    @DisplayName("입력받은 문자열에서 커스텀 구분자를 추출")
//    @Test
//    void extraction(){
//        StringDelimiter stringDelimiter = new StringDelimiter();
//        String str = "//;\\n1;2;3";
//        System.out.println("stringDelimiter.extraction(str) = " + stringDelimiter.extraction(str));
//        assertThat(stringDelimiter.extraction(str)).isEqualTo(";");
//
//        String str2 = "//%\\n1;2;3";
//        System.out.println("stringDelimiter.extraction(str2) = " + stringDelimiter.extraction(str));
//        assertThat(stringDelimiter.extraction(str2)).isEqualTo("%");
//    }
//
//    @DisplayName("문자열에서 //부터 /n까지 제거")
//    @Test
//    void remove() {
//        String str = "//;\\n1;2;3";
//        StringDelimiter stringDelimiter = new StringDelimiter();
//        assertThat(stringDelimiter.remove(str)).isEqualTo("1;2;3");
//    }
//
//    @DisplayName("커스텀 구분자로 문자열에서 Split")
//    @Test
//    void customSplit() {
//        String str = "1@2@3";
//        StringDelimiter stringDelimiter = new StringDelimiter();
//        List<Integer> splitNumbers = Arrays.asList(1,2,3);
//        List<Integer> numbers = stringDelimiter.customSplit(str, "@");
//
//        for(int i = 0; i<numbers.size(); i++) {
//            assertThat(numbers.get(i)).isEqualTo(splitNumbers.get(i));
//        }
//    }
//
//    @DisplayName("쉼표, 콜론으로 문자열에서 split")
//    @Test
//    void defaultSplit() {
//        String str1 = "1;2,3,4";
//        StringDelimiter stringDelimiter = new StringDelimiter();
//        assertThat(stringDelimiter.defaultSplit(str1).get(0)).isEqualTo(1);
//        assertThat(stringDelimiter.defaultSplit(str1).get(1)).isEqualTo(2);
//        assertThat(stringDelimiter.defaultSplit(str1).get(2)).isEqualTo(3);
//        assertThat(stringDelimiter.defaultSplit(str1).get(3)).isEqualTo(4);
//    }
//
//    @DisplayName("추출한 값이 숫자나 음수가 아니면 Exception 출력")
//    @Test
//    void validator() {
//        String str1 = "1;3,-1,4";
//        StringDelimiter stringDelimiter = new StringDelimiter();
//        org.assertj.core.api.Assertions.assertThatExceptionOfType(RuntimeException.class)
//                .isThrownBy(() -> {
//                    stringDelimiter.defaultSplit(str1);
//                });
//    }
//}
