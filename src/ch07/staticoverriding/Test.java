package ch07.staticoverriding;

public class Test {
    public static void main(String[] args) {
        // 동적 바인딩
        Animal animal = new Cat();
        animal.sound();
        // eat 은 정적 메서드이기 때문에 객체를 생성하지 않고도 접근할 수 있다.
        // 물론 객체를 통해서도 접근할 수 있다.
        // 정적 메서드가 하위 클래스에서 재정의 되는 경우에는
        // 인스턴스 메서드가 재정의 되는 경우와는 달리
        // 참조변수의 타입을 보고 호출할 정적 메서드가 결정된다.
        animal.eat();
        Cat.eat();

        System.out.println("--------------------");

        animal = new Animal();
        animal.sound();
        animal.eat();
    }
}
