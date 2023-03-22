package ch06;

public class Car {
    int speed;

    // 매개변수 없는 생성자
    Car() {
        System.out.println("속도는 " + speed);
    }

    // 초기화 블럭
    {
        speed = 100;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
    }
}
