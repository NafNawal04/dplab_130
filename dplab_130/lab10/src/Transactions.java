import java.time.LocalDateTime;

public class Transactions {
    public String senderAccount;
    public String receiverAccount;
    public TransactionType transactionType;
    public double amount;
    public LocalDateTime date;

    public Transactions(TransactionType type, double _amount)
    {
        transactionType = type;
        amount = _amount;
        date = LocalDateTime.now();
    }

    public String toString() {
        return date + " | " + transactionType + " | Amount: " + amount;
    }
}
