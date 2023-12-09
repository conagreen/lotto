package lotto;

import lotto.domain.Lottoes;
import lotto.service.LottoService;
import lotto.view.InputView;

public class Application {
    public static void main(String[] args) {
        long amount = InputView.amount();
        LottoService lottoService = new LottoService();
        Lottoes lottoes = lottoService.createRandomLotto(amount);
    }
}
