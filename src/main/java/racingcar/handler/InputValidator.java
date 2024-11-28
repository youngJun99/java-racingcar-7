package racingcar.handler;

import racingcar.constants.Errors;

public class InputValidator {

    private static final String CAR_NAME_VALIDATION_REGEX = "^([가-힣a-zA-Z]+)(,[가-힣a-zA-Z]+)*$";
    private static final String TOKEN_VALIDATION_REGEX = "\\d+";

    public void validateCarNamesInput(String input) {
        if (!input.matches(CAR_NAME_VALIDATION_REGEX)) {
            throw new IllegalArgumentException(Errors.INVALID_CAR_NAMES_INPUT.getMessage());
        }
    }

    public void validateGameTokensInput(String input) {
        if (!input.matches(TOKEN_VALIDATION_REGEX)) {
            throw new IllegalArgumentException(Errors.INVALID_TOKENS_INPUT.getMessage());
        }
    }
}
