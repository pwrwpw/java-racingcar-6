package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }
}
