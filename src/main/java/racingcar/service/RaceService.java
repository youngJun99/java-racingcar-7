package racingcar.service;

import racingcar.domain.Cars;
import racingcar.domain.random.Movable;
import racingcar.dto.RoundResultDto;
import racingcar.handler.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RaceService {

    private final InputHandler inputHandler;
    private final Movable movable;
    private Cars cars;

    public RaceService(InputHandler inputHandler, Movable movable) {
        this.inputHandler = inputHandler;
        this.movable = movable;
    }

    public List<RoundResultDto> getRoundResult() {
        int tokens = initializeGame();
        return playGames(tokens);
    }

    public List<String> getWinners() {
        return cars.findWinners();
    }

    private int initializeGame() {
        List<String> carNames = inputHandler.getCarNames();
        cars = new Cars(carNames);
        return inputHandler.getGameTokens();
    }

    private List<RoundResultDto> playGames(int tokens) {
        List<RoundResultDto> result = new ArrayList<>();
        for (int i = 0; i < tokens; i++) {
            RoundResultDto roundResult = cars.playOneRound(movable);
            result.add(roundResult);
        }
        return result;
    }

}
