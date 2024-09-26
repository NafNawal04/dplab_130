package Payment_Method;
public class Digital_Wallet implements PaymentMethod{
    public String walletHolderName;
    public Digital_Wallet(String walletHolderName){
        this.walletHolderName = walletHolderName;
    }

    public void processPayment(double amount) {
        System.out.println("Digital wallet of "+ walletHolderName
                + " has been used and "+ amount+ " has been paid.");
    }
}

