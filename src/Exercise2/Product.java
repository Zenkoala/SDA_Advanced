package Exercise2;

public class Product {

    private String name;

    double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
