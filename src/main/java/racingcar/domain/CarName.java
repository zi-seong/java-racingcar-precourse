package racingcar.domain;

public class CarName {

    private final int CAR_NAME_MAX_LENGTH = 5;

    private String name;

    private CarName(){}

    public CarName(String name) {
        //TODO:자동차이름 입력시 CAR_NAME_MAX_LENGTH 넘어가면 에러발생시키기
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
