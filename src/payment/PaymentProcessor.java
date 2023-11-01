package payment;

public class PaymentProcessor {
    String name;
    int securityCode;

    public PaymentProcessor(String name, int securityCode) {
        this.name = name;
        this.securityCode = securityCode;
    }

    public String getName() {
        return name;
    }

    public int getSecurityCode() {
        return securityCode;
    }
}
