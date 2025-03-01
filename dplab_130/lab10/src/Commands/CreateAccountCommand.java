package Commands;
import Invoker.*;

public class CreateAccountCommand implements ICommand {
    public BankAccountInvoker bank;
    public String accountNumber;
    public double initialDeposit;

    public CreateAccountCommand(BankAccountInvoker bank, String accountNumber, double initialDeposit) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
    }

    @Override
    public void execute() {
        bank.createAccount(accountNumber, initialDeposit);
    }

}
