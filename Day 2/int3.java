interface Payment {
    void makePayment(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class int3 {
    public static void main(String[] args) {
        Payment cc = new CreditCardPayment();
        Payment upi = new UPIPayment();

        cc.makePayment(1500.0);
        upi.makePayment(450.0);
    }
}
