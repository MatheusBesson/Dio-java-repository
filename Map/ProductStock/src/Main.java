public class Main {
    public static void main(String[] args) {
        // testing
        ProductsStock productsStock = new ProductsStock();

        productsStock.addProduct("Glove", 10, 250);
        productsStock.addProduct("Scissors", 2, 150);
        productsStock.addProduct("Tablet", 499, 80);
        productsStock.addProduct("Macbook", 1990, 35);
        productsStock.addProduct("i9 processor", 800, 15);
        productsStock.addProduct("Sword", 3459, 1);
        productsStock.addProduct("Firearm", 1, 6000);

        productsStock.getHigherProductPrice();
        productsStock.getLowestProductPrice();
        productsStock.showProducts();
        productsStock.getLargestQuantityProduct();
        productsStock.stockValue();

    }
}
