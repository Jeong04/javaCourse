package ch09.remoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl rc = new SamsungTv();
        rc.turnOn();
        rc.volumeControl(4);

        rc = new LgTV();
        rc.turnOn();
        rc.volumeControl(-2);
    }

    public static void turnOnAndControlVolume(RemoteControl rc, int vol) {
        rc.turnOn();
        if(rc instanceof AdvancedRemoteControl) {
            ((AdvancedRemoteControl)rc).volumeControl(vol);
        } else {
            System.out.println("이 기기는 원격 볼륨제어를 지원하지 않습니다.");
        }
    }
}
