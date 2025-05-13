import java.util.ArrayList;
public class ShoppingCart {

    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty!");
        } else {
            System.out.println("Your Shopping Cart:");
            for (Product product : cart) {
                System.out.println(product.displayProduct());
            }
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}

