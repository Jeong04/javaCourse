package ch07;

class Lion extends Animal {
    private int legs = 4;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void roar() {
        System.out.println("roar()가 호출되었음");
    }
}

class Eagle extends Animal {
    private int wings = 2;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void fly() {
        System.out.println("fly()가 호출되었음");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.roar();
        System.out.println("\n-------------------\n");
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.sleep();
        eagle.sleep();
    }
}
