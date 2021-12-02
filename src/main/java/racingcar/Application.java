package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;


public class Application {
    public static void main(String[] args) {
        String[] arrayCar = inputToArray();
        Car[] arrayCarObject = arrayCarObj(arrayCar);
        int count = CountingGame();
        PlayGame(arrayCarObject,count);
        GameSet(arrayCarObject);
    }
    private static void PlayGame(Car[] arrayCarObject, int count) {
        System.out.println("실행결과");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arrayCarObject.length; j++) {
                PrintCarPosition(arrayCarObject[j]);
            }
            System.out.println();
        }
    }

    private static void GameSet(Car[] arrayCarObject) {
        System.out.print("최종 우승자 : ");
        String winners = FindWinner(arrayCarObject);
        System.out.println(winners);
    }

    private static String FindWinner(Car[] arrayCarObject) {
        // TO DO : 한 명씩 확인해서 우승자를 찾고, 문자열로 반환할 매소드
        String winners = "";

        return "winners";
    }

    private static void PrintCarPosition(Car car) {
        car.Move(GoOrStop());
        car.PrintStatus();
    }

    private static boolean GoOrStop() {
        int randomNum = Randoms.pickNumberInRange(0,9);
        if (randomNum >= 4) {
            return true;
        }
        else {
            return false;
        }
    }

    private static int CountingGame() {
        System.out.println("시도할 회수는 몇회인가요?");
        String str = Console.readLine();
        try {
            int counting = Integer.parseInt(str);
            if (counting <= 0) {
                System.out.println("0보다 큰 자연수를 입력해주세요");
                return CountingGame();
            }
            System.out.println();
            return counting;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
            return CountingGame();
        }
    }

    private static String[] inputToArray() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String inputCarName = Console.readLine();
        String[] arrayCar = inputCarName.split(",");
        return arrayCar;
    }

    private static Car[] arrayCarObj(String[] arrayCar) {
        Car[] arrayCarObj = new Car[arrayCar.length];
        for (int i = 0; i < arrayCar.length; i++) {
            arrayCarObj[i] = new Car(arrayCar[i]);
        }
        return arrayCarObj;
    }

}
