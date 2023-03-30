package ch07;

public class Test {
    public static void main(String[] args) {
        Derived d = new Derived();
        // Derived d = new Derived("홍길동"); 오류 발생 - 생성자에 String 매개변수가 없기 때문
    }
}