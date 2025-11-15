class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay() {
        System.out.println("Payment done using Net Banking");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay();

        p = new UPIPayment();
        p.pay();

        p = new NetBankingPayment();
        p.pay();
    }
}
