import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> productsPrice;
    private Map<String,Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        return this.productsPrice.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productsStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.productsStock.keySet().contains(product)) {
            int stock = this.productsStock.get(product);
            if (stock > 0) {
                this.productsStock.replace(product, stock, stock - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return this.productsPrice.keySet();
    }
}
