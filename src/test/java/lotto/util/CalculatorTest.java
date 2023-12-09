package lotto.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"5 + 8:13", "5 + 3:8", "5 + 5 + 1:11"}, delimiter = ':')
    @DisplayName("덧셈 테스트 - 문자열은 공백을 기준으로 숫자와 사칙 연산 기호로 이루어짐")
    void 덧셈_테스트(String input, long expected ) {
        long actual = Calculator.add(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}