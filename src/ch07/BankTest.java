package ch07;

public class BankTest {
    public static void main(String[] args) {
        ABank a = new ABank();
        BBank b = new BBank();
        CBank c = new CBank();

        System.out.println("A Bank의 이자율 : " + a.getInterestRate());
        System.out.println("B Bank의 이자율 : " + b.getInterestRate());
        System.out.println("C Bank의 이자율 : " + c.getInterestRate());
    }
}

class ABank extends Bank {
    @Override
    public double getInterestRate() {
        return super.getInterestRate() + 3.0;
    }
}

class BBank extends Bank {
    @Override
    public double getInterestRate() {
        return super.getInterestRate() + 5.0;
    }
}

class CBank extends Bank {
    public CBank() {
        super.setInterestRate(super.getInterestRate() + 10.0);
    }
}