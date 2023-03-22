package ch06;

class MyCounter1 {
    int counter;

    MyCounter1() { // 매개변수 없는 생성자
        counter = 1;
    }
}

public class MyCounterTest_01 {
    public static void main(String[] args) {

        // 객체 생성 - 생성자 호출
        MyCounter1 obj1 = new MyCounter1();
        MyCounter1 obj2 = new MyCounter1();

        // 출력
        System.out.println("객체 1의 counter = " + obj1.counter);
        System.out.println("객체 2의 counter = " + obj2.counter);

    }
}
