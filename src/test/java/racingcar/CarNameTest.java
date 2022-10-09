package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {


    @Test
    void successCarName() {

        CarName carName = new CarName("CAR1");
        String name = carName.getName();
        assertThat(name).isEqualTo("CAR1");
    }

    @Test
    void overMaxCarNameLength() {
        assertThatThrownBy(() -> {
            CarName carName = new CarName("123456");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}