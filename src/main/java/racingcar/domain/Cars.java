package racingcar.domain;

import racingcar.domain.random.Movable;
import racingcar.dto.CarResultDto;
import racingcar.dto.RoundResultDto;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Cars {

    List<Car> cars;

    public Cars(List<String> carNames) {
        this.cars = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public RoundResultDto playOneRound(Movable movable) {
        cars.forEach(car -> car.go(movable));
        return new RoundResultDto(cars.stream()
                .map(car -> {
                    return new CarResultDto(car.getName(), car.getDistance());
                })
                .toList());
    }

    public List<String> findWinners() {
        int maxDistance =
    }

    private int findMaxDistance() {
        OptionalInt optionalInt = cars.stream()
                .mapToInt(Car::getDistance)
                .max();
        return optionalInt.getAsInt();
    }
}
