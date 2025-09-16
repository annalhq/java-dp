package cls.behavioral.cor.loan;

public class President extends LoanApprover {
    public President() {
    }

    public void ApproveLoan(Loan loan) {
        System.out.println("Loan amount of " + loan.getAmount() + " approved by the President");
    }
}
