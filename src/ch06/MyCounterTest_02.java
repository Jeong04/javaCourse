package ch06;

class MyCounter2 {
    int counter;

    // 매개변수를 가지는 생성자.
    MyCounter2(int value) {
        counter = value;
    }
}

public class MyCounterTest_02 {
    public static void main(String[] args) {

        // instance 생성, 생성자를 통해 멤버 변수에 값을 할당
        MyCounter2 obj1 = new MyCounter2(100);
        MyCounter2 obj2 = new MyCounter2(200);

        // 출력
        System.out.println("객체 1의 counter = " + obj1.counter);
        System.out.println("객체 2의 counter = " + obj2.counter);
    }
}
