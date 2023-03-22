package ch05;

class Box {
    int width;
    int length;
    int height;
}

public class BoxTest {
    public static void main(String[] args) {
        /*
         * instance 생성 방법
         * 1. 클래스명 참조변수명
         * 2. 참조변수명 = new 클래스명(); // 간략화 → 클래스명 참조변수명 = new 클래스명()
         */
        Box b;
        b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width +", " + b.length + ", " + b.height + "입니다.");
    }
}
