package lotto.service;

import lotto.domain.Lotto;
import lotto.domain.LottoNumbers;
import lotto.domain.Lottoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoService {
    private static final int EACH_AMOUNT = 1_000;
    private static final int LOTTO_NUMBER_RANGE = 45;
    private static final int LOTTO_NUMBER_COUNT = 6;

    public Lottoes createRandomLotto(long totalAmount) {
        final long count = calculateLottoTicketCount(totalAmount);
        final Lottoes lottoes = new Lottoes();

        for (int i = 0; i < count; i++) {
            lottoes.addLotto(new Lotto(getRandomLottoNumbers()));
        }

        return lottoes;
    }

    private LottoNumbers getRandomLottoNumbers() {
        List<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 1; i <= LOTTO_NUMBER_RANGE; i++) lottoNumbers.add(i);
        Collections.shuffle(lottoNumbers);
        lottoNumbers.subList(0, LOTTO_NUMBER_COUNT);
        return new LottoNumbers(lottoNumbers);
    }

    private long calculateLottoTicketCount(long totalAmount) {
        return totalAmount / EACH_AMOUNT;
    }
}
