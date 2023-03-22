package ch05;

class Television3 {
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

public class TelevisionTest_03 {
    public static void main(String[] args) {

        // instance 생성
        Television3 myTv = new Television3();

        myTv.setChannel(11); // 매개변수가 있는 메서드인 setChannel()에 값 11이 전달됨

        int ch = myTv.getChannel(); // setChannel 을 통해 할당된 값 11을 반환하여 int 타입 변수 ch에 저장

        // 출력
        System.out.println("현재 채널은 " + ch + "입니다.");

    }
}
