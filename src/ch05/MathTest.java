package ch05;

class Math {

    // 메서드 정의
    int add(int x, int y) { // int x, int y → add()의 매개변수(인자, Parameter)
        return x + y;
    }

}

public class MathTest {
    public static void main(String[] args) {

        int sum; // 메서드 add 의 값을 저장할 변수 sum 선언

        Math obj = new Math(); // instance 생성

        sum = obj.add(2, 3); // 2, 3은 인수(Argument)로서 add()로 전달되고 반환된 값을 sum 에 저장
        System.out.println("2와 3의 합은 " + sum); // 출력

        sum = obj.add(7, 8);
        System.out.println("7과 8의 합은 " + sum);
    }
}
