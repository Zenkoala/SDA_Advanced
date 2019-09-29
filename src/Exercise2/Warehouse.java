package Exercise2;

import java.util.List;

public class Warehouse {

    private String name;
    private List<Product> products;

    public Warehouse(String name) {
        this.name = name;
    }

    public Warehouse(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Warehouse setName(String name) {
        this.name = name;
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Warehouse setProducts(List<Product> products) {
        this.products = products;
        return this;
    }
}
