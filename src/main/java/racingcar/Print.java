package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class Print {
    public static ArrayList<Car> carArrayList = new ArrayList<>();
    static final int MAX_NAME_LENGTH = 5;

    public static void InputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[]carsName = Console.readLine().split(",");
        CheckCarName(carsName);
    }

    private static void CheckCarName(String[] carsName) {
        for (int i = 0; i < carsName.length; i++) {
            if (carsName[i].length() > MAX_NAME_LENGTH) {
                Except.NotValidName();
                return;
            }
        }
    }
}
