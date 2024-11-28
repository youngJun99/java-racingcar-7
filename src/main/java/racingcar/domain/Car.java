package racingcar.domain;

import racingcar.domain.random.CarName;
import racingcar.domain.random.Movable;

public class Car {

    private final CarName carName;
    private int distance;

    public Car(String name) {
        this.carName = new CarName(name);
        this.distance = 0;
    }

    public String getName() {
        return carName.getName();
    }

    public int getDistance() {
        return distance;
    }

    public void go(Movable movable) {
        if (movable.canMove()) {
            distance++;
        }
    }
}
