package ch07.objectClass;

public class Car {
    String brand;
    String modelName;

    public Car(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public Car() {
        this("Unknown", "Unknown");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        // ojb 가 Car 클래스의 인스턴스가 아니면 바로 false 를 반환
        // 자바에는 이 목적으로 사용할 수 있는 연산자가 있다.
        // instanceof
        if(obj instanceof Car == false) return false;

        // obj 는 Car 클래스의 객체라 가정
        // 하향 형변환
        Car yourCar = (Car)obj;
        if(yourCar.brand.equals(brand) && yourCar.modelName.equals(modelName))
            return true;
        return false;
    }
}
