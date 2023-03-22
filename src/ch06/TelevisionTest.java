package ch06;

class Television {

    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int channel;
    private int volume;
    private boolean onOff;

    // 매개변수 있는 생성자
    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    // Television 정보 출력 메서드.
    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {

        // 객체 생성 및 생성자를 통한 멤버변수에 값 할당
        Television myTv = new Television(7, 10, true);
        // 할당된 멤버 변수들 정보 print
        myTv.print();

        // 상기와 동일
        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
