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

    public void scan()
    {    
        register.purchase(scan.nextLine());
    }

    private Scanner scan;
    private CashRegister register;
}
