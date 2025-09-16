package cls.behavioral.cor.loan;

public class Chain {
    public Chain(){}
    public static void main(String[] args) {
        Manager m1 = new Manager();
        President p1 = new President();
        Director d1 = new Director();

        m1.SetNextApprover(p1);
        p1.SetNextApprover(d1);

        m1.ApproveLoan(new Loan(100000));
        m1.ApproveLoan(new Loan(500000));
        m1.ApproveLoan(new Loan(9000000));


    }
}
