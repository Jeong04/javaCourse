package ch07;

public class Bank {
    private double interestRate = 0.0;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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
