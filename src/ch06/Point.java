package ch06;

public class Point {
    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int x = 0;
    private int y = 0;

    // 생성자
    // 아래와 같은 경우에는 this 를 써도 아무런 장점이 없음

     /*
        public point(int a, int b) {
            x = a;
            y = b;
        }
      */

    void point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
