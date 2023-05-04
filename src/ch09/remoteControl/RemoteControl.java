package ch09.remoteControl;

// 인터페이스의 모든 메소드는 public abstract 이다.
public interface RemoteControl {
    void turnOn();
    void turnOff();

    default void volumeControl(int amount) {
        String st = null;
        st = amount > 0 ? st = "높입니다." : "낮춥니다.";
        amount = Math.abs(amount); // 절대값
        System.out.println("볼륨을 " + amount + " 만큼 " + st);
    }
}
