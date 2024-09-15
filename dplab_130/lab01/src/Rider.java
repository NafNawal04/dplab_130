public class Rider {
    public int id;
    public String name;
    public String location;
    public int rating;
    public PaymentMethod preferredPaymentMethod;


    public Rider(int id, String name, PaymentMethod preferredPaymentMethod)
    {
        this.id = id;
        this.name = name;
        this.location = null;
        this.rating = 0;
        this.preferredPaymentMethod =preferredPaymentMethod;
    }

    public void requestRide()
    {

    }


    public void rateDriver()
    {

    }

    public void makePayment(double amount) {
        preferredPaymentMethod.processPayment(amount);
    }
}
