package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarPosition;

import static org.assertj.core.api.Assertions.assertThat;

public class CarPositionTest {

    @Test
    void moveForward(){
        CarPosition position = new CarPosition(0);
        position.updatePosition(4);
        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    void stop(){
        CarPosition position = new CarPosition(0);
        position.updatePosition(3);
        assertThat(position.getPosition()).isEqualTo(0);
    }

}
