package lotto.util;

public class Calculator {

    public static long add(String input) {
        String[] tokens = input.split(" ");
        long answer = 0;
        for (int i = 0; i < tokens.length; i++) {
            answer += Integer.parseInt(tokens[i++]);
        }
        return answer;
    }

    public static long subtract(String input) {
        String[] tokens = input.split(" ");
        long answer = Long.parseLong(tokens[0]);
        for (int i = 2; i < tokens.length; i++) {
            answer -= Integer.parseInt(tokens[i++]);
        }
        return answer;
    }

    public static long multiply(String input) {
        String[] tokens = input.split(" ");
        long answer = Long.parseLong(tokens[0]);
        for (int i = 2; i < tokens.length; i++) {
            answer *= Integer.parseInt(tokens[i++]);
        }
        return answer;
    }

    public static double divide(String input) {
        String[] tokens = input.split(" ");
        double answer = Long.parseLong(tokens[0]);
        for (int i = 2; i < tokens.length; i++) {
            answer /= Integer.parseInt(tokens[i++]);
        }
        return answer;
    }
}
