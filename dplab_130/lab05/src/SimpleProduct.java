public class SimpleProduct implements IProduct{
    private String name;
    private String description;
    private double price;

    public SimpleProduct(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }


    public void display() {
        System.out.println("Product: " + name + " | Description: " + description + " | Price: $" + price);
    }


}
