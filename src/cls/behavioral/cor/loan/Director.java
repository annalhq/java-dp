package cls.behavioral.cor.loan;

public class Director extends LoanApprover{
    public Director() {
    }

    public void ApproveLoan(Loan loan) {
        if (loan.getAmount() <= 1000000) {
            System.out.println("Loan amount of " + loan.getAmount() + " approved by the Director");
        } else {
            this.nextApprover.ApproveLoan(loan);
        }

    }
}
