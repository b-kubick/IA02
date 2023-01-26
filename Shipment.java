import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// DO NOT CHANGE ANYTHING AT ALL IN THIS CLASS!!!

public class Shipment {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public Iterable<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

}

