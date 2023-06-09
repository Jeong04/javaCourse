package ch07;

class SportsCar extends Car {
    private boolean turbo;

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public void print() {
        System.out.println("speed [" + getSpeed() + "], turbo [" + isTurbo() + "]");
    }
}

public class SportsCarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.setSpeed(150);
        sc.setTurbo(true);

        sc.print();
    }
}
