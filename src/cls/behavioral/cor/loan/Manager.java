package cls.behavioral.cor.loan;

public class Manager extends LoanApprover{

    public void ApproveLoan(Loan i){
        if (i.getAmount() <= 500000){
            System.out.println("Loan of amount " + i.getAmount() + " approved by the Manager");
        }
        else nextApprover.ApproveLoan(i);
    }
}
