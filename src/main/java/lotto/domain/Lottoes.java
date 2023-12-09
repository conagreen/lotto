package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lottoes {
    private List<Lotto> lottos = new ArrayList<>();

    public void addLotto(Lotto lotto) {
        lottos.add(lotto);
    }

    public long count() {
        return lottos.size();
    }
}
