package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    static final int LINE = 4;
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void RandomGoAhead() {
        if (LINE <= Randoms.pickNumberInRange(0,9)) {
            this.position++;
        }
    }
}
