package cls.template.payment;

public class CreditCard extends PaymentGateway{
    @Override
    void welcome() {
        super.welcome();
        System.out.println("American Express Credit card gateway");
    }

    @Override
    public void processPayment() {
        System.out.println("Amount ${} is ready to process");
    }

    @Override
    public void validatePayment() {
        System.out.println("Credit card validation checking...");
    }

    @Override
    public void transfer() {
        System.out.println("Transferring amount to receiver..");
    }

    @Override
    public void updateDatabase() {
        System.out.println("Payment successful");
        System.out.println("Updated the database");
    }
}
