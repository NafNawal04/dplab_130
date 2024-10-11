public class BirthdayBundle extends Bundle{
    public BirthdayBundle()
    {
        super("Birthday Bundle", "A bundle of happiness", 15);
        build();

    }

    public void build()
    {
        IProduct chocolates = new SimpleProduct("Chocolate","It's a chocolate.",100);
        IProduct flowers = new SimpleProduct("Flowers","It's a flowers.",150);


        addProduct(chocolates);
        addProduct(flowers);
    }
}
