package cls.template.payment;

public class NetBanking extends PaymentGateway{
    @Override
    void welcome() {
        super.welcome();
        System.out.println("Morgan Stanley Online Gateway");
    }

    @Override
    public void processPayment() {
        System.out.println("Amount ${} is ready to process via online route");
    }

    @Override
    public void validatePayment() {
        System.out.println("Online Account validation checking...");
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
