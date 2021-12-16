package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    static final int LINE = 4;
    static int maxDistance = 0;
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void RandomGoAhead() {
        if (LINE <= Randoms.pickNumberInRange(0,9)) {
            this.position++;
            maxDistance = Math.max(maxDistance,this.position);
        }
    }
    public void PrintPosition() {
        System.out.print(name + " : ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
