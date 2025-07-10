public class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, int quantity, double price) {
        this.name = name.trim();
        this.quantity = quantity;
        this.price = price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
