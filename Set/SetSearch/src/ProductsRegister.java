import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductsRegister {
    Set<Product> productSet;

    public ProductsRegister() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(int id, String name, double price, int quantity) {
        productSet.add(new Product(id, name, price, quantity));
        System.out.println("Product added to the set.");
    }

    public Set<Product> productsByName() {
        Set<Product> productByName = new TreeSet<>(productSet);
        return productByName;
    }

    public Set<Product> productsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productSet.addAll(productSet);
        return productsByPrice;
    }

}
