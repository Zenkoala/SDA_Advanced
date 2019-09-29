package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("NumeroUno");
        Main main = new Main();
        main.addProductsToWarehouse(warehouse);
//        main.showProductOfWarehouse(warehouse);
    }

    public void addProductsToWarehouse (Warehouse warehouse) {
        List<Product> milk = new ArrayList<>();
        milk.add(new Product("Skimmed"));
        milk.add(new Product("Not Skimmed"));
        milk.add(new Product("Cow"));
        warehouse.setProducts(milk);
    }

//    public void showProductOfWarehouse (Warehouse warehouse) {
//        for (Product product : warehouse.getNameOfProducts()){
//            System.out.println(product.getName());
//        }
//    }
}