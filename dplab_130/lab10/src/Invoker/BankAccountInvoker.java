package Invoker;
import Repository.BankAccount;
import java.util.*;

public class BankAccountInvoker {
    public Map<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accountNumber, double initialDeposit)
    {
        if (accounts.containsKey(accountNumber))
        {
            System.out.println("Account already exists!");
            return;
        }
        accounts.put(accountNumber, new BankAccount(accountNumber, initialDeposit));
        System.out.println("Account created: " + accountNumber + " | Initial Deposit: " + initialDeposit);
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
