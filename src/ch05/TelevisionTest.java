package ch05;

class Television {
    // 멤버 변수 선언
    int channel; // 채널 번호
    int volume; // 볼륨
    boolean onOff; // 전원 상태

    // 메서드 정의
    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }

    int getChannel() { // get: 값을 반환
        return channel;
    }

    void setChannel(int ch) { // set: 값을 할당
        channel = ch;
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        // instance 생성
        Television myTv = new Television();

        // instance 사용(변수 접근)
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;

        // 메서드 호출 → 참조변수.메서드이름(); or 참조변수.메서드이름(값1, 값2, ...)
        myTv.print();

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        yourTv.print();
    }
}
