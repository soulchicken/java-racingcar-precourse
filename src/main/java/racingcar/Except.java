package racingcar;

public class Except {
    public static void NotValidName() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("유효하지 않은 이름입니다.");
            Print.InputCarNames();
        }
    }
}
