package payment;

public class PayPalPayment extends PaymentProcessor{
    String payPalAccount;

    public PayPalPayment(String name, int securityCode, String payPalAccount) {
        super(name, securityCode);
        this.payPalAccount = payPalAccount;
    }

    public String getPayPalAccount() {
        return payPalAccount;
    }
}
