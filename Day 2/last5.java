abstract class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

class SBI extends Bank {
    public SBI(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05; // 5% interest rate
    }
}

class HDFC extends Bank {
    public HDFC(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.06; // 6% interest rate
    }
}

class ICICI extends Bank {
    public ICICI(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.055; // 5.5% interest rate
    }
}

public class last5 {
    public static void main(String[] args) {
        Bank sbi = new SBI(100000.0);
        Bank hdfc = new HDFC(100000.0);
        Bank icici = new ICICI(100000.0);

        System.out.println("SBI Interest: ₹" + sbi.calculateInterest());
        System.out.println("HDFC Interest: ₹" + hdfc.calculateInterest());
        System.out.println("ICICI Interest: ₹" + icici.calculateInterest());
    }
}
