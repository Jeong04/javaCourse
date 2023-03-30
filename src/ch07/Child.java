package ch07;

public class Child extends Parent {
    @Override
    public void print() {
        super.print();
        System.out.println("자식 클래스의 print() 메소드");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.print();
    }
}
