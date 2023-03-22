package ch05;

class MyMath {

    // 오버라이딩: 매개변수의 타입, 개수가 다를 경우 반환값과 상관 없이 메서드 이름이 같아도 용인됨 (메서드 square)

    // 정수값을 제곱하는 메서드
    int square(int i) {
        return i * i;
    }

    // 실수값을 제곱하는 메서드
    double square(double i) {
        return i * i;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        // instance 생성
        MyMath obj = new MyMath();

        // 인수가 int 타입이므로 int square() 메서드에 값 10이 전달됨
        System.out.println(obj.square(10));

        // 인수가 double 타입이므로 double square() 메서드에 값 3.14가 전달됨
        System.out.println(obj.square(3.14));
    }
}
