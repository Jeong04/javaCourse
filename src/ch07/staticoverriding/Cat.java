package ch07.staticoverriding;

public class Cat extends Animal {
    // 정적 메서드는 오버라이딩 불가
    public static void eat() {
        System.out.println("고양이가 밥을 먹습니다.");
    }

    @Override
    public void sound() {
        System.out.println("Sound of Cat");
    }
}
