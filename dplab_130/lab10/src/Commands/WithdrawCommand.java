package Commands;
import Repository.*;

public class WithdrawCommand implements ICommand {
    public BankAccount account;
    public double amount;

    public WithdrawCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}
