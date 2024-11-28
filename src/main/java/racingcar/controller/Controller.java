package racingcar.controller;

import racingcar.dto.RoundResultDto;
import racingcar.service.RaceService;
import racingcar.view.OutputView;

import java.util.List;


public class Controller {

    private final RaceService raceService;
    private final OutputView outputView;

    public Controller(RaceService raceService, OutputView outputView) {
        this.raceService = raceService;
        this.outputView = outputView;
    }

    public void run() {
        List<RoundResultDto> results = raceService.getRoundResult();
        List<String> winners = raceService.getWinners();
        outputView.printRoundResults(results);
        outputView.printWinners(winners);
    }

}
