import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> shoppingCart = new ArrayList<>();
    double totalValue;
    ;

    public void addItem(Item item) {
        shoppingCart.add(item);
        System.out.println("Item added to the shopping cart.");
    }

    public void removeItem(String name) {
        boolean flag = false;
        String trimName = name.trim();
        for (Item item : shoppingCart) {
            if (item.name.equalsIgnoreCase(trimName)) {
                flag = true;
                System.out.println("Item removed from list.");
            }
        }
        if (flag) {
            shoppingCart.removeIf(i -> i.getName().equalsIgnoreCase(trimName));
        } else {
            System.out.println("Item not found.");
        }
    }

    public void totalValue() {
        for (int i = 0; i < shoppingCart.size(); i++) {
            totalValue += shoppingCart.get(i).getPrice();
        }
        System.out.println(String.format("Total price: %.2f. \n", totalValue ));
    }

    public void allItems() {
        String message = "";
        for (int i = 0; i < shoppingCart.size(); i++) {
            message += String.format("==========\n" +
                    "Item %d: \n" +
                    "Name: %s \n" +
                    "Price: %.2f \n" +
                    "Quantity: %d \n==========", i+1, shoppingCart.get(i).getName(), shoppingCart.get(i).getPrice(), shoppingCart.get(i).getQuantity());
        }
        System.out.println(message);
    }
}


