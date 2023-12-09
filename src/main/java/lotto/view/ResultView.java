package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.Lottoes;

public class ResultView {
    public static void lottoPurchaseInfo(Lottoes lottoes) {
        System.out.printf("%d개를 구매했습니다.%n", lottoes.count());
        for (Lotto lotto : lottoes.getLottoes()) {
            System.out.println(lotto.getNumbers());
        }
    }
}
