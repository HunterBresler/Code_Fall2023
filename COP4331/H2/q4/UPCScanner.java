package H2.q4;

import java.io.InputStream;
import java.util.Scanner;

// Class to scan items/get user input
public class UPCScanner 
{
    // Constructor
    public UPCScanner(InputStream in)
    {
        this.scan = new Scanner(in);
        register = new CashRegister();
    }

    // Scans UPC from terminal
    // Returns 1 or 0
    // 0 continues purchase
    // 1 ends purchase
    public int scan()
    {    
        return register.purchase(scan.nextLine());
    }

    private Scanner scan;
    private CashRegister register;
}
