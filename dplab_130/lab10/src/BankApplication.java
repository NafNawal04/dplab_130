public class BankApplication {
    public static void main(String[] args) {
        BankAccountInvoker bank = new BankAccountInvoker();

        ICommand createAccount1 = new CreateAccountCommand(bank, "Nafisa130", 500);
        ICommand createAccount2 = new CreateAccountCommand(bank, "Nafisa115", 500);
        createAccount1.execute();
        createAccount2.execute();


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
