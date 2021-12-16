package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class Print {
    static final int MAX_NAME_LENGTH = 5;

    public static ArrayList<Car> carArrayList = new ArrayList<>();
    private static String[] carsName;
    static int numberOfGame;

    public static void InputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        carsName = Console.readLine().split(",");
        CheckCarName();
    }

    private static void CheckCarName() {
        if (carsName.length == 0) {
            Except.NotValidName();
            return;
        }
        for (String name : carsName) {
            if (name.length() > MAX_NAME_LENGTH) {
                Except.NotValidName();
                return;
            }
        }
        MakeCarArrayList();
    }

    private static void MakeCarArrayList() {
        for (String name : carsName) {
            carArrayList.add(new Car(name));
        }
    }

    public static void InputNumberOfGame() {
        try {
            numberOfGame = Integer.parseInt(Console.readLine());
            if (numberOfGame < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("0 이상의 정수를 입력해주세요");
            InputNumberOfGame();
        }
    }

    public static void PlayGame() {
        for (Car car : carArrayList) {
            car.RandomGoAhead();
            car.PrintPosition();
        }
    }
}
