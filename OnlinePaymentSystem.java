// Abstract class PaymentMethod
abstract class PaymentMethod {
    abstract void processPayment();
}

// CreditCard class
class CreditCard extends PaymentMethod {
    void processPayment() {
        System.out.println("Payment via Credit Card with a fee.");
    }
}

// PayPal class
class PayPal extends PaymentMethod {
    void processPayment() {
        System.out.println("Payment via PayPal without a fee.");
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCard();
        PaymentMethod payment2 = new PayPal();

        payment1.processPayment(); // Calls CreditCard's processPayment
        payment2.processPayment(); // Calls PayPal's processPayment
    }
}
