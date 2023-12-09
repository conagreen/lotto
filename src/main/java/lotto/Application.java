package lotto;

import lotto.view.InputView;

public class Application {
    public static void main(String[] args) {
        long amount = InputView.amount();
        System.out.println("amount = " + amount);
    }
}
