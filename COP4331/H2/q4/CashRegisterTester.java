package H2.q4;

public class CashRegisterTester 
{
    public static void main(String[] args) 
    {
        // Set up scanner
        UPCScanner newUpcScanner = new UPCScanner(System.in);
        int i = 0;

        // Scan until purchase is complete
        // Purchase is completed when scan() returns a non-zero value (1)
        while(i == 0)
        {
            // Scans from terminal 
            // THERE IS NO PROMPT OR ERROR CHECKING
            i = newUpcScanner.scan();
        }
    }
}
