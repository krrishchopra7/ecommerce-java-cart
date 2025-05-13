public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the e-commerce shopping cart!");
    
        Product product1= new Product("Laptop",999.99);
        Product product2= new Product("Smartphone",599.99);
        Product product3= new Product("Headphone",199.99);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.displayCart();

        System.out.println("Total price: $" + cart.calculateTotal());
    } 
}