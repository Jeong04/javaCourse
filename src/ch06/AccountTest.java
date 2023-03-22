package ch06;

class Account {

    // 같은 클래스에서만 접근이 가능한 멤버변수(객체 생성을 통한 직접 접근은 불가)
    private int regNumber;
    private String name;
    private int balance;

    // 위의 멤버변수를 간접 접근하기 위한 public method 정의
    // get: 값 반환 - set: 값 할당

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;    // this.변수명으로 따로 표기하지 않으면 매개변수로 판단되므로 멤버 변수에 접근하는 경우엔 this. 붙일 것
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        // instance 생성
        Account obj = new Account();

        /* 특별한 사유가 없는 이상 멤버 변수에는 private 를 걸어두고, public 메서드를 통해 멤버 변수에 간접접근 하도록 하는 것이 좋음 */

        // 값 할당 (메서드를 통한 간접접근)
        obj.setName("Tom");
        obj.setBalance(100000);

        // 값 반환 (메서드를 통한 간접접근)
        System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
    }
}
