package ch06;

import java.util.*;

class Employee {
    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private String name;
    private double salary;

    private static int count = 0; // 정적 변수

    // 매개변수 있는 생성자
    public Employee(String n, double s) {
        name = n;
        salary = s;
        count++; // 정적변수인 count 를 증가
    }

    protected void finalize() {
        count--; // 직원 감소에 따른 count -1
    }

    // 정적 메소드
    public static int getCount() {
        return count;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        // instance 생성, 생성자를 통한 값 전달
        // instance 생성마다 count 값이 1씩 증가
        Employee e1 = new Employee("김철수", 35000);
        Employee e2 = new Employee("최수철", 50000);
        Employee e3 = new Employee("김철호", 20000);

        System.out.println("현재의 직원수= " + Employee.getCount());

        // 빈 값으로 처리
        e1 = null;

        // 명시적으로 가비지 컬렉션이 일어나도록 함
        System.gc();
        System.out.println("계속하려면 enter 를 치세요.");

        // 엔터 처리
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println("현재의 직원수= " + Employee.getCount());
    }
}
