public class TechBundle extends Bundle{
    public TechBundle()
    {
        super("Tech Bundle", "A bundle of tech gadgets", 10);
        build();

    }

    public void build()
    {
        IProduct laptop = new SimpleProduct("Laptop","It's a laptop.",100);
        IProduct mobile = new SimpleProduct("Mobile","It's a mobile.",150);
        IProduct pc = new SimpleProduct("PC","It's a pc.",250);

        addProduct(laptop);
        addProduct(mobile);
        addProduct(pc);
    }
}
