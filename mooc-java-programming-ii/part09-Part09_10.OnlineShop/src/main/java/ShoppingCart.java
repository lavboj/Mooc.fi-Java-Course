import java.util.HashMap;
import java.util.Map;


public class ShoppingCart{
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.products.containsKey(product))
            this.products.get(product).increaseQuantity();
        else
            this.products.putIfAbsent(product, new Item(product, 1, price));
    }

    public int price() {
        int total = 0;
        for (Item item : this.products.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : this.products.values()) {
            System.out.println(item);
        }
    }
}
