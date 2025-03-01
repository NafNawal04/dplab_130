public class TransferCommand implements ICommand{
    public BankAccount sender;
    public BankAccount receiver;
    public double amount;

    public TransferCommand(BankAccount _sender, BankAccount _receiver, double amount) {
        sender = _sender;
        receiver = _receiver;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sender.transfer(receiver,amount);
    }
}
