package lotto;

import lotto.domain.Lottoes;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.ResultView;

public class Application {
    public static void main(String[] args) {
        long amount = InputView.amount();
        LottoService lottoService = new LottoService();
        Lottoes lottoes = lottoService.createRandomLotto(amount);
        ResultView.lottoPurchaseInfo(lottoes);
    }
}
