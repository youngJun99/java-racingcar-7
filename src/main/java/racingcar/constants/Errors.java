package racingcar.constants;

public enum Errors {
    //입력 에러
    INVALID_CAR_NAMES_INPUT("자동차 이름 입력 형식이 잘못되었습니다"),
    INVALID_TOKENS_INPUT("게임 횟수 입력 형식이 잘못되었습니다."),
    CAR_NAME_LENGTH("자동차 이름의 길이가 %d자 이상입니다.");




    private static final String PREFIX = "[ERROR] ";

    private String message;

    Errors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
