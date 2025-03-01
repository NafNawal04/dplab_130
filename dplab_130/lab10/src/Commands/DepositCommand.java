package Commands;
import Repository.*;

public class DepositCommand implements ICommand {
    public BankAccount account;
    public double amount;

    public DepositCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }
}
