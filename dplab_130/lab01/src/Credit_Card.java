public class Credit_Card implements PaymentMethod{
    public String cardHolderName;
    public int cardNumber;


    public Credit_Card(int cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void processPayment(double amount) {
        System.out.println("Credit card of "+ cardHolderName +
                " has been used and "+ amount+ " has been paid.");
    }
}

