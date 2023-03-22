package ch06;

class MyCounter3 {
    // 멤버 변수
    int value;

    // 멤버 메서드
    void inc(int a) {
        a = a + 1;
    }
}

public class MyCounterTest_03 {
    public static void main(String[] args) {

        // instance 생성
        MyCounter3 obj = new MyCounter3();

        // int 자료형 변수 선언
        int x = 10;

        // inc 메서드에 변수 x의 값을 전달
        obj.inc(x);

        // 출력
        System.out.println("x = " + x);  // x의 복사본이 전달되므로 inc() 안에서 값 변동을 해도 MyCounterTest3 에 선언된 변수 x의 값에는 변동이 없음
    }
}
