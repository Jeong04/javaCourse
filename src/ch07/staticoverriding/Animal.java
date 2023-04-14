package ch07.staticoverriding;

public class Animal {
    // 모든 Animal class 의 인스턴스가 공유하는 정적 메서드
    public static void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
    
    // sound 는 instance method
    // 즈, 객체가 생성되어야만 존재할 수 있는 메서드
    public void sound() {
        System.out.println("Sound of Animal");
    }
}