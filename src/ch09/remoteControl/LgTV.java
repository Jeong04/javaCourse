package ch09.remoteControl;

import ch09.remoteControl.RemoteControl;

public class LgTV implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("LG TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV를 끕니다.");
    }
}
