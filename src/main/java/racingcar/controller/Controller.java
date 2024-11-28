package racingcar.controller;

import racingcar.service.RaceService;
import racingcar.view.OutputView;

public class Controller {

    private final RaceService raceService;
    private final OutputView outputView;

    public Controller(RaceService raceService, OutputView outputView) {
        this.raceService = raceService;
        this.outputView = outputView;
    }

}
