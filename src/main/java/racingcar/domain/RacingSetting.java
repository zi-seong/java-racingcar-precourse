package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class RacingSetting {



    private Cars cars = new Cars();

    private int round = 0;

    public  RacingSetting(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,) 기준으로 구분");
        this.cars = new Cars(Console.readLine());
        System.out.println("시도할 회수는 몇회인가요?");
        String roundNum = Console.readLine();
        validateRoundNum(roundNum);
        this.round = Integer.parseInt(roundNum);
    }

    public Cars getCars() {
        return cars;
    }

    public int getRound(){
        return round;
    }

    private void validateRoundNum(String roundNum) {
        try{
          Integer.parseInt(roundNum);
        }catch (NumberFormatException ne){
            throw new IllegalArgumentException("[ERROR] 시도할 회수는 숫자로만 입력해야합니다. 다시 입력해주세요.");
        }
    }
}
