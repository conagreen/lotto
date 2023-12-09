package lotto.util;

public class Calculator {

    public static long add(String input) {
        String[] tokens = input.split(" ");
        int answer = 0;
        for (int i = 0; i < tokens.length; i++) {
            answer += Integer.parseInt(tokens[i++]);
        }
        return answer;
    }
}
