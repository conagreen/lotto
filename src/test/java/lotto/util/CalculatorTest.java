package lotto.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest(name = "[{index}] 덧셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 + 8:13", "5 + 3:8", "5 + 5 + 1:11"}, delimiter = ':')
    @DisplayName("덧셈 테스트")
    void 덧셈_테스트(String input, long expected) {
        double actual = Calculator.calculate(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] 뺄셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 - 1:4", "3 - 3:0", "5 - 5 - 1:-1"}, delimiter = ':')
    @DisplayName("뺄셈 테스트")
    void 뺄셈_테스트(String input, long expected) {
        double actual = Calculator.calculate(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] 곱셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 * 0:0", "3 * 3:9", "5 * 5 * 2:50"}, delimiter = ':')
    @DisplayName("곱셈 테스트")
    void 곱셈_테스트(String input, long expected) {
        double actual = Calculator.calculate(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest(name = "[{index}] 나눗셈 테스트 {0} = {1}")
    @CsvSource(value = {"5 / 1:5", "1 / 2:0.5", "12 / 2 / 2:3"}, delimiter = ':')
    @DisplayName("나눗셈 테스트")
    void 나눗셈_테스트(String input, double expected) {
        double actual = Calculator.calculate(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("입력 값이 null 또는 빈 공백일 경우 IllegalArgumentException 반환")
    void 입력_값이_null_또는_빈_공백일_경우_IllegalArgumentException_반환(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> Calculator.calculate(input));
    }

    @Test
    @DisplayName("사칙연산 기호가 아닌 경우 IllegalArgumentException 반환")
    void 사칙연산_기호가_아닌_경우_IllegalArgumentException_반환() {
        String input = "123 + 456 % 789";
        assertThatIllegalArgumentException().isThrownBy(() -> Calculator.calculate(input));
    }

    @ParameterizedTest(name = "[{index}] 두개 이상의 사칙연산을 포함하는 계산 {0} = {1}")
    @CsvSource(value = {"2 + 3 * 4 / 2:10", "2 + 2 * 2:8", "5 / 2 - 2:0.5"}, delimiter = ':')
    @DisplayName("두개 이상의 사칙연산을 포함하는 계산 - 계산 순서는 사칙연산의 우선순위가 아닌 입력 값의 순서")
    void 두개_이상의_사칙연산을_포함하는_계산(String input, double expected) {
        double actual = Calculator.calculate(input);
        assertThat(actual).isEqualTo(expected);
    }
}