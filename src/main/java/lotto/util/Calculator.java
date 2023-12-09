package lotto.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* 해당 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다.
* 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
* */
public class Calculator {
    private static final Pattern ALLOWABLE_RANGE_OF_VALUES = Pattern.compile("[^0-9\\s+\\-*/]");

    public static double calculate(String input) {
        validateInputValue(input);
        String[] tokens = input.split(" ");
        double answer = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            answer = calculate(tokens[i], Double.parseDouble(tokens[++i]), answer);
        }
        return answer;
    }

    private static double calculate(String sign, double num, double answer) {
        switch (sign) {
            case "+":
                return add(num, answer);
            case "-":
                return subtract(num, answer);
            case "*":
                return multiply(num, answer);
            case "/":
                return divide(num, answer);
        }

        throw new IllegalArgumentException();
    }

    private static double add(double num, double answer) {
        return answer + num;
    }

    private static double subtract(double num, double answer) {
        return answer - num;
    }

    private static double multiply(double num, double answer) {
        return answer * num;
    }

    private static double divide(double num, double answer) {
        return answer / num;
    }

    private static void validateInputValue(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException();
        }

        Matcher matcher = ALLOWABLE_RANGE_OF_VALUES.matcher(input);
        if (matcher.find()) {
            throw new IllegalArgumentException();
        }
    }
}
