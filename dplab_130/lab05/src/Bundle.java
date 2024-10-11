import java.util.ArrayList;
import java.util.List;

abstract class Bundle implements IProduct{
    private String name;
    private String description;
    private double discount;
    private List<IProduct> products = new ArrayList<>();

    abstract void build();

    public Bundle(String name, String description, double discount) {
        this.name = name;
        this.description = description;
        this.discount = discount;
    }

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public void removeProduct(IProduct product) {
        products.remove(product);
    }


    public double getPrice() {
        double total = 0;
        for (IProduct prod : products) {
            total += prod.getPrice();
        }

        return total * (1 - (discount / 100));
    }


    public void display() {
        System.out.println("Bundle: " + name + " | Description: " + description + " | Discount: " + discount + "%");
        System.out.println("Contents:");
        for (IProduct prod : products)
        {
            prod.display();
        }
        System.out.println("Total Price of Bundle: $" + getPrice());
    }



}
