package sample;

public class CreditCardProcesser implements PaymentProcesser {

    @Override
    public void pay() {
        System.out.println("Processing default payment using credit card");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " rupees using credit card");
    }
}
