package ch06;

class Point {

    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int x, y;

    // 매개변수 있는 생성자
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
    // toString: 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "Point [x = " + x + ", y = " + y + "]";
    }
}

class Circle {

    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int radius;

    // Point 참조 변수 선언
    private Point center;

    // 매개변수 있는 생성자
    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
    // toString: 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "Circle [radius =" + radius + ", center = " + center + "]";
    }
}

public class CircleTest {
    public static void main(String[] args) {

        // instance 생성, 생성자에 따른 멤버 변수 값 할당
        Point p = new Point(25, 78);

        // 참조변수 p의 참조값이 생성자에 할당하므로, 참조변수 p의 생성자를 통해 값이 할당된 멤버 변수 참조값이 참조변수 c에 넘겨짐
        Circle c = new Circle(p, 10);

        // 출력
        System.out.println(c);
    }
}
