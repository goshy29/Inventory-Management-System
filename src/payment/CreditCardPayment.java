package payment;

public class CreditCardPayment extends PaymentProcessor{
    int cardNumber;

    public CreditCardPayment(String name, int securityCode, int cardNumber) {
        super(name, securityCode);
        this.cardNumber = cardNumber;
    }
}
