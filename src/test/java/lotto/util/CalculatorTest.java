package lotto.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @ParameterizedTest(name = "[{index}] 덧셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 + 8:13", "5 + 3:8", "5 + 5 + 1:11"}, delimiter = ':')
    @DisplayName("덧셈 테스트")
    void 덧셈_테스트(String input, long expected) {
        long actual = Calculator.add(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] 뺄셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 - 1:4", "3 - 3:0", "5 - 5 - 1:-1"}, delimiter = ':')
    @DisplayName("뺄셈 테스트")
    void 뺄셈_테스트(String input, long expected) {
        long actual = Calculator.subtract(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] 곱셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 * 0:0", "3 * 3:9", "5 * 5 * 2:50"}, delimiter = ':')
    @DisplayName("곱셈 테스트")
    void 곱셈_테스트(String input, long expected) {
        long actual = Calculator.multiply(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] 나눗셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 / 1:5", "1 / 2:0.5", "12 / 2 / 2:3"}, delimiter = ':')
    @DisplayName("나눗셈 테스트")
    void 나눗셈_테스트(String input, double expected) {
        double actual = Calculator.divide(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}