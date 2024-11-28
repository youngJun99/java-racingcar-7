package racingcar.domain.random;

import racingcar.constants.Errors;

public class CarName {

    private final int CAR_NAME_LIMIT = 5;

    private final String name;

    public CarName(String name) {
        validateNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateNameLength(String input) {
        if (input.length() > CAR_NAME_LIMIT) {
            throw new IllegalArgumentException(String.format(Errors.CAR_NAME_LENGTH.getMessage(), CAR_NAME_LIMIT));
        }
    }
}
