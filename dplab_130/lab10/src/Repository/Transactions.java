package Repository;

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


    public Transactions(String sender, String receiver, double _amount) {
        this.transactionType = TransactionType.TRANSFER;
        this.senderAccount = sender;
        this.receiverAccount = receiver;
        this.amount = _amount;
        this.date = LocalDateTime.now();
    }

    public String toString() {
        if (transactionType == TransactionType.TRANSFER) {
            return date + " | " + transactionType + " | From: " + senderAccount + " → To: " + receiverAccount + " | Amount: " + amount;
        }
        return date + " | " + transactionType + " | Amount: " + amount;
    }
}
