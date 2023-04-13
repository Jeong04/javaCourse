package ch07.objectClass;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
//        Class classVar = car.getClass();
//        System.out.println(classVar.getName());

        System.out.println("브랜드는 " + car.brand + " 이고, 모델은 " + car.modelName + " 이다.");

        System.out.println("---------------------------------------");

        Car car1 = new Car("현대", "그랜저");
        Car car2 = new Car("현대", "그랜저");
        System.out.println(car1.equals(car2));
    }
}
