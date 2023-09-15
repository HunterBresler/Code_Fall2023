package H2.q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CashRegister 
{
    // Constructor
    public CashRegister()
    {
        // Add inventory
        // No clue how to do this as a constant since they're class objects
        Product product1 = new Product("Pizza Slice", 101, 2.99);
        Product product2 = new Product("Soda", 102, .99);
        Product product3 = new Product("Hot Dog", 103, .99);
        Product product4 = new Product("Churro", 104, .99);
        Product product5 = new Product("Pizza Pie", 105, 15.99);
        inventory = Arrays.asList(product1, product2, product3, product4, product5);
        

        // initialize currentPurchase
        currentPurchase = new ArrayList<Product>();
    }

    public void purchase(String scan)
    {
        if (scan == "Pay")
        {
            displayReceipt();
        }
        else
        {
            // Get product
            // Assumes valid UPC since instructions don't require error checking
            int UPC = Integer.parseInt(scan);
            Product product = getProduct(UPC);

            // Add product to cart and display it's info
            addToCart(product);
            displayProduct(product);
        }
    }

    // gets UPC, returns Product 
    public Product getProduct(int UPC)
    {
        List<Product> scannedProduct = inventory.stream()
                                                .filter(product -> product.getUPC() == UPC)
                                                .collect(Collectors.toList());
        return scannedProduct.get(0);
    }

    // Add an item to currentPurchase
    public void addToCart(Product product)
    {
        currentPurchase.add(product);
    }

    public void displayProduct(Product product)
    {

    }

    public void displayReceipt()
    {

    }

    private List<Product> inventory;
    private List<Product> currentPurchase;
}
