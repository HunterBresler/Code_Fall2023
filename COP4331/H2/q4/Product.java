package H2.q4;

// Class that keeps track of a product's info
public class Product 
{
    // Constructor
    public Product(String name, int UPC, double price)
    {
        this.name = name;
        this.UPC = UPC;
        this.price = price;
    }

    //*Getters
    public String getName()
    {
        return name;
    }

    public int getUPC()
    {
        return UPC;
    }

    public double getPrice()
    {
        return price;
    }

    private String name;
    private int UPC; 
    private double price;
}
