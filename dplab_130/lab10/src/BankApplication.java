public class BankApplication {
    public static void main(String[] args) {
        BankAccountInvoker bank = new BankAccountInvoker();

        ICommand createAccount = new CreateAccountCommand(bank, "130", 500);
        createAccount.execute();


        BankAccount account1 = bank.getAccount("130");
        ICommand deposit = new DepositCommand(account1, 200);
        deposit.execute();


        ICommand withdraw = new WithdrawCommand(account1, 100);
        withdraw.execute();

        AccountQuery query = new AccountQuery(account1);
        query.displayBalance();
        query.displayTransactionHistory();
    }
}
