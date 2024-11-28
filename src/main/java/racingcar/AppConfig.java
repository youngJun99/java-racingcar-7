package racingcar;

import racingcar.controller.Controller;
import racingcar.domain.random.RandomMovable;
import racingcar.handler.InputHandler;
import racingcar.handler.InputValidator;
import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class AppConfig {

    public Controller controller() {
        return new Controller(
                new RaceService(
                        new InputHandler(
                                new InputView(),
                                new InputValidator()),
                        new RandomMovable()),
                new OutputView());
    }
}
