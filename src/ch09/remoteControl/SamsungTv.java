package ch09.remoteControl;

import ch09.remoteControl.AdvancedRemoteControl;

public class SamsungTv implements AdvancedRemoteControl {

    @Override
    public void turnOn() {
        System.out.println("삼성 티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("삼성 티비를 끕니다.");
    }

    @Override
    public void volumeControl(int amount) {
        System.out.println();
    }
}
