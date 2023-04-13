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
        // obj 는 Car 클래스의 객체라 가정
        Car yourCar = (Car)obj;
        if(yourCar.brand.equals(brand) && yourCar.modelName.equals(modelName))
            return true;
        return false;
    }
}
