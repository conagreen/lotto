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

    @ParameterizedTest
    @CsvSource(value = {"5 - 1:4", "3 - 3:0", "5 - 5 - 1:-1"}, delimiter = ':')
    @DisplayName("뺄셈 테스트")
    void 뺄셈_테스트(String input, long expected ) {
        long actual = Calculator.subtract(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"5 * 0:0", "3 * 3:9", "5 * 5 * 2:50"}, delimiter = ':')
    @DisplayName("곱셈 테스트")
    void 곱셈_테스트(String input, long expected ) {
        long actual = Calculator.multiply(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}