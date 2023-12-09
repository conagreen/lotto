package lotto.service;

import lotto.domain.Lottoes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LottoServiceTest {
    @ParameterizedTest(name = "[{index}] 로또 생성 테스트 (자동) {0}원 -> {1}개")
    @CsvSource(value = {"3000:3", "14000:14", "1000:1"}, delimiter = ':')
    @DisplayName("로또 생성 테스트 (자동)")
    void createRandomLotto(long input, long expected) {
        LottoService lottoService = new LottoService();
        Lottoes sut = lottoService.createRandomLotto(input);
        long actual = sut.count();
        assertThat(actual).isEqualTo(expected);
    }
}