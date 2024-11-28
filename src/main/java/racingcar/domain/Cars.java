package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    List<Car> cars;

    public Cars(List<String> carNames) {
        this.cars = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public
}
