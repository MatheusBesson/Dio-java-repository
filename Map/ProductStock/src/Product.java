public class Product {
    private String name;
    private double uniPrice;
    private int quantity;
    private double totalValue;

    public Product(String name, double uniPrice, int quantity) {
        this.name = name;
        this.uniPrice = uniPrice;
        this.quantity = quantity;
        this.totalValue = uniPrice * quantity;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUniPrice() {
        return uniPrice;
    }

    public void setUniPrice(double uniPrice) {
        this.uniPrice = uniPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
