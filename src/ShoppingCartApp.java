import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShoppingCartApp {
    private JFrame frame;
    private JTextArea cartArea;
    private ArrayList<String> cartItems = new ArrayList<>();

    public ShoppingCartApp() {
        frame = new JFrame("E-Commerce Shopping Cart");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Shopping Cart", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        JButton addItemButton = new JButton("Add Product");
        JButton viewCartButton = new JButton("View Cart");
        JButton checkoutButton = new JButton("Checkout");

        cartArea = new JTextArea();
        cartArea.setEditable(false);

        addItemButton.addActionListener(e -> addItem());
        viewCartButton.addActionListener(e -> viewCart());
        checkoutButton.addActionListener(e -> checkout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addItemButton);
        buttonPanel.add(viewCartButton);
        buttonPanel.add(checkoutButton);

        frame.setLayout(new BorderLayout());
        frame.add(title, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(new JScrollPane(cartArea), BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void addItem() {
        String name = JOptionPane.showInputDialog(frame, "Enter product name:");
        String price = JOptionPane.showInputDialog(frame, "Enter product price:");

        if (name != null && price != null) {
            cartItems.add(name + " - ₹" + price);
            JOptionPane.showMessageDialog(frame, "Product added to cart!");
        }
    }

    private void viewCart() {
        if (cartItems.isEmpty()) {
            cartArea.setText("Cart is empty.");
        } else {
            StringBuilder cartText = new StringBuilder("Items in Cart:\n");
            for (String item : cartItems) {
                cartText.append("- ").append(item).append("\n");
            }
            cartArea.setText(cartText.toString());
        }
    }

    private void checkout() {
        if (cartItems.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Cart is empty.");
        } else {
            JOptionPane.showMessageDialog(frame, "Checkout complete!\nThank you for your purchase.");
            cartItems.clear();
            cartArea.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShoppingCartApp::new);
    }
}
