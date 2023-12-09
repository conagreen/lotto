package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbers {
    private List<LottoNumber> numbers;

    public LottoNumbers(List<Integer> numbers) {
        this.numbers = new ArrayList<>();
        for (int number : numbers) {
            this.numbers.add(new LottoNumber(number));
        }
    }
}
