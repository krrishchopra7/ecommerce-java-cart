import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                products.remove(product);
                System.out.println(productName + " has been removed from your cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }

    public void displayCart() {
        System.out.println("Your Shopping Cart:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
