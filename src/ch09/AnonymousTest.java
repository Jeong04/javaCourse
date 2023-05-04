package ch09;

import ch09.remoteControl.*;

public class AnonymousTest {
    public static void main(String[] args) {
        RemoteControl rt1 = new SamsungTv();
        rt1.turnOff();

        RemoteControl rt2 = new LgTV();
        rt2.turnOn();

        // 무명 클래스인 SonyTv 객체를 만들어 보자.
        RemoteControl rt3 = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Sony TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Sony TV를 끕니다.");
            }
        };
        rt3.turnOn();

        // 여기서 문제. Student 클래스를 상속받는 무명 클래스를 생성하고 이름을 출력해보시오.
        // 무명 클레스를 만들 때는 제약이 있는데, 새로운 생성자를 정의할 수 없다.
        Student st1 = new Student("대학원생인 홍길동", "컴정") {
            @Override
            public String getName() {
                return "안녕하세요? " + super.getName() + " 입니다.";
            }
        };
        System.out.println(st1.getName());
    }
}
