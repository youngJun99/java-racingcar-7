package racingcar.view;

import racingcar.dto.RoundResultDto;

import java.util.List;

public class OutputView {

    public void printRoundResults(List<RoundResultDto> result) {
        System.out.println("실행 결과");
        result.forEach(this::printOneRound);
    }

    public void printWinners(List<String> winners) {
        String winnerString = String.join(",",winners);
        System.out.println("최종 우승자 : "+winnerString);
    }

    private void printOneRound(RoundResultDto roundResultDto) {
        roundResultDto.roundResult().forEach(carResultDto -> {
                    System.out.println(carResultDto.carName() + " : " + "-".repeat(carResultDto.distance()));
                });
    }
}
