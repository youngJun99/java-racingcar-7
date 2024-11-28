package racingcar.domain.random;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovable implements Movable {

    private static final int MOVE_INDEX = 4;

    @Override
    public boolean canMove() {
        return Randoms.pickNumberInRange(0, 9) >= MOVE_INDEX;
    }
}
