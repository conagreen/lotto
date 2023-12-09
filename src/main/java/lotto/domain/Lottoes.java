package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lottoes {
    private List<Lotto> lottoes = new ArrayList<>();

    public void addLotto(Lotto lotto) {
        lottoes.add(lotto);
    }

    public long count() {
        return lottoes.size();
    }

    public List<Lotto> getLottoes() {
        return lottoes;
    }
}
