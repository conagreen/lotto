package lotto.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private static final Pattern ALLOWABLE_RANGE_OF_VALUES = Pattern.compile("[^0-9\\s+\\-*/]");


    public static long add(String input) {
        validateInputValue(input);

        String[] tokens = input.split(" ");
        long answer = 0;
        for (int i = 0; i < tokens.length; i++) {
            answer += Integer.parseInt(tokens[i++]);
        }
        return answer;
    }

    public static long subtract(String input) {
        validateInputValue(input);

        String[] tokens = input.split(" ");
        long answer = Long.parseLong(tokens[0]);
        for (int i = 2; i < tokens.length; i++) {
            answer -= Integer.parseInt(tokens[i++]);
        }
        return answer;
    }

    public static long multiply(String input) {
        validateInputValue(input);

        String[] tokens = input.split(" ");
        long answer = Long.parseLong(tokens[0]);
        for (int i = 2; i < tokens.length; i++) {
            answer *= Integer.parseInt(tokens[i++]);
        }
        return answer;
    }

    public static double divide(String input) {
        validateInputValue(input);

        String[] tokens = input.split(" ");
        double answer = Long.parseLong(tokens[0]);
        for (int i = 2; i < tokens.length; i++) {
            answer /= Integer.parseInt(tokens[i++]);
        }
        return answer;
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
