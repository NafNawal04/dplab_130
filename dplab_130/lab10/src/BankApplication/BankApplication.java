package BankApplication;
import Commands.*;
import Invoker.*;
import Repository.*;

public class BankApplication {
    public static void main(String[] args) {
        BankAccountInvoker bank = new BankAccountInvoker();

        ICommand createAccount1 = new CreateAccountCommand(bank, "Nafisa130", 500);
        ICommand createAccount2 = new CreateAccountCommand(bank, "Nafisa115", 500);
        createAccount1.execute();
        createAccount2.execute();


        BankAccount account1 = bank.getAccount("Nafisa130");
        BankAccount account2 = bank.getAccount("Nafisa115");
        ICommand deposit = new DepositCommand(account1, 200);
        deposit.execute();


        ICommand withdraw = new WithdrawCommand(account1, 100);
        withdraw.execute();

        ICommand transfer = new TransferCommand(account1,account2,200);
        transfer.execute();


        AccountQuery query1 = new AccountQuery(account1);
        query1.displayBalance();
        query1.displayTransactionHistory();

        AccountQuery query2 = new AccountQuery(account2);
        query2.displayBalance();
        query2.displayTransactionHistory();
    }
}
