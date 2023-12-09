package lotto.domain;

import java.util.List;

public class Lotto {
    LottoNumbers numbers;

    public Lotto(LottoNumbers numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers.getNumbers();
    }
}
