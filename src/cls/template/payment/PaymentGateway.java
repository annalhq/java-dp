package cls.template.payment;

public abstract class PaymentGateway {

    void welcome(){ // HOOK
        System.out.println("Payment window is opened, DO NOT CLOSE THE WINDOW!");
    }
    public abstract void processPayment();
    public abstract void validatePayment();
    public abstract void transfer();
    public abstract void updateDatabase();
    public final void makePayment(){
        processPayment();
        validatePayment();
        transfer();
        updateDatabase();
    }
}
