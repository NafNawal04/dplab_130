public class Paypal implements PaymentMethod{

    public String accountHolderName;
    public int otp;


    public Paypal(int otp, String accountHolderName){
        this.otp = otp;
        this.accountHolderName = accountHolderName;
    }

    public void processPayment(double amount) {
        System.out.println("Paypal of "+ accountHolderName +
                " has been used and "+ amount+ " has been paid.");
    }
}

