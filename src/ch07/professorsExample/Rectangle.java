package ch07.professorsExample;

public class Rectangle extends Shape { // 추상 메소드를 사용하지 않으면 오류 발생
    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}
