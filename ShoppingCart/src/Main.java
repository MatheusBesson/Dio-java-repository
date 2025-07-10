public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Pokemon card", 10, 3.99));
        shoppingCart.addItem(new Item("Drills", 1, 859.90));

        shoppingCart.allItems();
        shoppingCart.removeItem("     Pokemon cArd   ");
        shoppingCart.allItems();
        shoppingCart.totalValue();
    }
}
