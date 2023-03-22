package ch05;

class Car {
    // 멤버 변수 선언
    String color; // 색상
    int speed; // 속도
    int gear; // 기어

    // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
    // toString: 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
    }

    // 메서드 정의
    void changeGear(int g) {
        gear = g;
    }

    void speedUp() {
        speed = speed + 10;
    }

    void speedDown() {
        speed = speed - 10;
    }
}

public class CarTest {
    public static void main(String[] args) {

        // instance 생성
        Car myCar = new Car();

        myCar.changeGear(1); // 매개변수가 있는 메서드인 changeGear()에 값 1이 전달됨
        myCar.speedUp(); // int 타입은 별도로 초기화 안 했을 경우 디폴트 값은 0이므로 +10을 했을 때 speed 값은 10이 됨

        // 출력
        System.out.println(myCar);
    }
}
