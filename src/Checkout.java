public class Checkout {
    private ShoppingCart cart;

    // Constructor to initialize the shopping cart
    public Checkout(ShoppingCart cart) {
        this.cart = cart;
    }

    // Process the checkout
    public void processCheckout() {
        double total = cart.calculateTotal();

        if (total > 0) {
            System.out.println("Processing checkout...");
            System.out.println("Total: $" + total);
            System.out.println("Thank you for your purchase! Your order will be shipped soon.");
        } else {
            System.out.println("Your cart is empty. Please add products to the cart before proceeding.");
        }
    }
}
