package ch06;

class Date {
    // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
    private int year;
    private String month;
    private int day;

    // 생성자 오버로딩

    // 매개변수 없는 생성자
    public Date() {
        this(1900, "1월", 1);
    }

    // 매개변수 있는 생성자
    public Date(int year) {
        this(year, "1월", 1);
    }

    // 매개변수 있는 생성자
    public Date(int year, String month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
    // toString: 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "Date [year = " + year + ", month = " + month + " day = " + day + "]";
    }
}

public class DateTest {
    public static void main(String[] args) {
        // instance 생성
        // 각 생성자마다 멤버 변수의 값이 할당됨
        Date date1 = new Date(2015, "8월", 10);
        Date date2 = new Date(2020);
        Date date3 = new Date();

        // 출력
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
