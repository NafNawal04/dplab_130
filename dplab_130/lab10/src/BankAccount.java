import java.util.*;

public class BankAccount {
    public String accNumber;
    public double balance;

    public List<Transactions> transactionHistory ;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add(new Transactions(TransactionType.INITIAL_BALANCE, initialBalance));

    }

    public void deposit(double amount){
        balance += amount;
        transactionHistory.add(new Transactions(TransactionType.DEPOSIT, amount));
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        balance -= amount;
        transactionHistory.add(new Transactions(TransactionType.WITHDRAWAL, amount));
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }

    public double getBalance(){
        return balance;
    }

    public List<Transactions> getTransactions() {
        return transactionHistory;
    }


}
