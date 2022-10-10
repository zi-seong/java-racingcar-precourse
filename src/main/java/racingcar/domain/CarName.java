package racingcar.domain;

public class CarName {

    private final int CAR_NAME_MAX_LENGTH = 5;

    private String name;

    public CarName(String name) {
        validateCarNameLength(name);
        validateCarNameEmpty(name);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private void validateCarNameLength(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 5자 이하만 입력 가능합니다. 다시 입력해주세요.");
        }
    }

    private void validateCarNameEmpty(String name) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름에 공백은 입력 불가능합니다. 다시 입력해주세요.");
        }
    }

}
