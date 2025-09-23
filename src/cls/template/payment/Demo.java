package cls.template.payment;

public class Demo {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCard();
        p1.makePayment();
        System.out.println();


        p1 = new NetBanking();
        p1.makePayment();
        System.out.println();
    }
}
