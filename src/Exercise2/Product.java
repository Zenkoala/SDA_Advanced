package Exercise2;

public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product(String name) {
        this.name = name;
    }
}
