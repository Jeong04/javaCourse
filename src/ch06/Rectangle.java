package ch06;

public class Rectangle {
    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int x, y;
    private int width, height;

    // 매개변수 없는 생성자 -> this()로 세 번째 생성자 호출
    Rectangle() {
        this(0, 0, 1, 1);
    }

    // 매개변수 있는 생성자 -> this()로 세 번째 생성자 호출
    Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    // 첫 번째, 두 번째 생성자한테 호출당한 생성자(매개변수 있음)
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
