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


    public void transfer(BankAccount receiver, double amount) {

        if (amount > balance) {
            System.out.println("Insufficient funds for transfer.");
            return;
        }
        this.balance -= amount;
        receiver.balance += amount;

        Transactions senderTransaction = new Transactions(this.accNumber, receiver.accNumber, amount);
        Transactions receiverTransaction = new Transactions(this.accNumber, receiver.accNumber, amount);

        this.transactionHistory.add(senderTransaction);
        receiver.transactionHistory.add(receiverTransaction);

        System.out.println("Transferred: " + amount + " from " + this.accNumber + " to " + receiver.accNumber);
    }

}
