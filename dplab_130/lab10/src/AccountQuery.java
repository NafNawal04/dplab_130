public class AccountQuery {
    public BankAccount account;

    public AccountQuery(BankAccount account) {
        this.account = account;
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for Account:");
        for (Transactions t : account.getTransactions()) {
            System.out.println(t);
        }
    }
}
