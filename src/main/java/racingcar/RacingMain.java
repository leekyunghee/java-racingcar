package racingcar;

import racingcar.model.Cars;
import racingcar.model.RacingGame;
import racingcar.model.Result;
import racingcar.utils.NumGenerator;
import racingcar.utils.RandomNumGenerator;

public class RacingMain {
    public static void main(String[] args) {

        String carNames = Input.getCarNames();
        int times = Input.getTimes();
        NumGenerator numGenerator = new RandomNumGenerator();

        RacingGame rg = new RacingGame(carNames, times, numGenerator);

        while (rg.isMovable()){
            Cars racingCars = rg.run();
            Result.printResult(racingCars);
        }

        Result.printWinners(rg.getCars());
    }
}