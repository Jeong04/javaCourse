package ch06;

class Box {
    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int width;
    private int length;
    private int height;
    private int volume;

    // public 메서드를 통한 private 멤버 변수 간접 접근하여 값을 반환함
    public int getVolume() {
        return volume;
    }

    // 매개변수 있는 생성자
    Box(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
        volume = width * length * height;
    }
}

public class BoxTest {
    public static void main(String[] args) {

        // 객체 생성 및 생성자를 통한 멤버변수에 값 할당
        Box b;
        b = new Box(20, 20, 30);

        // 부피 출력
        System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
    }
}
