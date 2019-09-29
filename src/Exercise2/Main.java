package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("NumeroUno");
        Main main = new Main();
        main.addNewProductToWareHouse(warehouse);

        System.out.println("Products are: ");
        for (Product product:warehouse.getProducts()){
            System.out.println(product.getName());
        }
        main.removeProductByName(warehouse, "Apple");

        System.out.println("Check if product is deleted successfully");
        System.out.println("After removing: ");
        for(Product product:warehouse.getProducts()){
            System.out.println(product.getName());
        }
    }

    private void addNewProductToWareHouse(Warehouse warehouse){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bread"));
        products.add(new Product("Apple"));
        products.add(new Product("Ice-cream"));
        products.add(new Product("Chocolate"));
        warehouse.setProducts(products);
    }

    private void removeProductByName(Warehouse warehouse, String productName) {
        Product foundProduct = null;
        for(Product product : warehouse.getProducts()){
            if(product.getName().equals(productName)){
                foundProduct = product;
            }
        }
        if(foundProduct!=null) {
            warehouse.getProducts().remove(foundProduct);
            System.out.println("--------------");
            System.out.println("Product woth the given: " + productName+ "  is deleted");
            System.out.println("--------------");
        }


    }
}