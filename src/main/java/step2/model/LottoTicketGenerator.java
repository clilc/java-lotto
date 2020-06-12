package step2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LottoTicketGenerator {

    private LottoTicketGenerator() {
    }

    public static LottoTicket generate(LottoCount lottoCount, ManualLottoNumbers manualLottoNumbers) {
        int autoCount = lottoCount.calculateAutoCount(manualLottoNumbers);

        List<Lotto> lottos = new ArrayList<>();
        lottos.addAll(createAutoLottos(autoCount));
        lottos.addAll(manualLottoNumbers.toLottos());

        return LottoTicket.create(lottos);
    }

    private static List<Lotto> createAutoLottos(int autoCount) {
        return Stream.generate(() -> Lotto.createAuto(LottoNumberGenerator.generate()))
                .limit(autoCount)
                .collect(Collectors.toList());
    }
}
