package racingcar.handler;

import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;

public class InputHandler {

    private final InputView inputView;
    private final InputValidator inputValidator;

    public InputHandler(InputView inputView, InputValidator inputValidator) {
        this.inputView = inputView;
        this.inputValidator = inputValidator;
    }

    public List<String> getCarNames() {
        String input = inputView.printInputCarNames();
        inputValidator.validateCarNamesInput(input);
        return Arrays.stream(input.split(","))
                .toList();
    }

    public int getGameTokens() {
        String input = inputView.printInputGameTokens();
        inputValidator.validateGameTokensInput(input);
        return Integer.parseInt(input);
    }
}
