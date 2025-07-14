import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductsStock {
    Map<Long, Product> productMap;
    private long id;

    public ProductsStock() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(String name, double uniPrice, int quantity) {
        Product product = new Product(name, uniPrice, quantity);
        id = idGen();
        productMap.put(id, product);
    }

    public long getId() {
        return id;
    }

    public void showProducts() {
        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            long id = entry.getKey();
            Product product = entry.getValue();
            System.out.printf("========== id: %d ==========\n" +
                    "Name: %s \n" +
                    "Unitary Price: U$%.2f \n" +
                    "Quantity: %d \n" +
                    "Total Value: U$%.2f \n\n", id, product.getName(), product.getUniPrice(), product.getQuantity(), product.getTotalValue());
        }
    }

    public void stockValue() {
        double totalValue = 0;
        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Long id = entry.getKey();
            Product product = entry.getValue();
            double value = product.getTotalValue();
            totalValue += value;
        }
        System.out.printf("The stock total valuation is: U$%.2f\n\n", totalValue);
    }

    public void getHigherProductPrice() {
        double iniPrice = 0;
        String productName = "none";
        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Long id = entry.getKey();
            Product product = entry.getValue();
            if (product.getUniPrice() > iniPrice) {
                iniPrice = product.getUniPrice();
                productName = product.getName();
            }
        }
        System.out.printf("The most valuable product in stock is: %s \n" +
                "Price: %.2f \n", productName, iniPrice);
    }

    public void getLowestProductPrice() {
        double iniPrice = Double.MAX_VALUE;
        String productName = "none";
        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Long id = entry.getKey();
            Product product = entry.getValue();
            if (product.getUniPrice() < iniPrice) {
                iniPrice = product.getUniPrice();
                productName = product.getName();
            }
        }
            System.out.printf("The lowest valuable product in stock is: %s \n" +
                    "Price: %.2f \n", productName, iniPrice);
    }

    public void getLargestQuantityProduct() {
        int largestQuantity = 0;
        String productName = "";
        for (Map.Entry<Long, Product> entry : productMap.entrySet()) {
            Long id = entry.getKey();
            Product product = entry.getValue();
            if (product.getQuantity() > largestQuantity) {
                largestQuantity = product.getQuantity();
                productName = product.getName();
            }
        }
        System.out.printf("The largest quantity product at stock is: %s \n" +
                "Quantity: %d \n\n", productName, largestQuantity);
    }


    public long idGen() {
        long id = (long) (Math.random() * 9000) + 1000;
        return id;
    }
}
