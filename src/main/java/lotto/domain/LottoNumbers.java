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

    public List<Integer> getNumbers() {
        List<Integer> lottoNumbers = new ArrayList<>();
        for (LottoNumber number : this.numbers) {
            lottoNumbers.add(number.getNumber());
        }
        return lottoNumbers;
    }
}
