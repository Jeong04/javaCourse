package ch07.finalClass;

public class FinalTest {
    // 바둑게임 관련 클래스라고 가정
    // getFirstPlayer 는 바둑에서 첫 번째 돌을 반환하다.
    // 바둑에서 첫번째 돌은 무조건 흑돌
    // 이런 경우, 이 클래스를 상속받는 하위 클래스에서 절대
    // 이 메소드를 재정의하지 못하도록 종단 메소드로 만들 필요가 있다.
    public final String getFirstPlayer() {
        return "BLACK";
    }
}
