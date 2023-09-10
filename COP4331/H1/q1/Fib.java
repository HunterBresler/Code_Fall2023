/* 
    Author: Hunter Bresler
    Class Fib: calculates and displays the Fibonacci series
*/

package H1.q1;

import java.util.Scanner;

public class Fib
{
    // Constructor
    public Fib(int newF0, int newF1)
    {
        f0 = newF0;
        f1 = newF1;
    }

    // Fibonacci Function (iterative)
    public int f(int n)
    {
        // Iterative fibonacci numbers
        int fi = f0;
        int fj = f1;
        int fk = 0;

        // Check base cases
        if (n == 0)
        {
            return f0;
        }
        else if (n == 1)
        {
            return f1;
        }

        // Iterate n times to find f(n) (stored in f(k))
        for (int k = 0; k <= n - 2; k++) // Sub 2 from n for base cases
        {
            // Run the fibonacci algorithm
            fk = fi + fj;
            fi = fj;
            fj = fk;
        }

        return fk;
    }

    // Fibonacci Function (recursive)
    public int fRec(int n)
    {
        // Return f0 or f1 depending on whether n is 0 or 1
        if (n == 0)
        {
            return f0;
        }
        else if (n == 1)
        {
            return f1;
        }

        return fRec(n - 1) + fRec(n - 2);
    }

    public static void main(String[] args) 
    {
        // Get arguments f0, f1, and fn
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter f0: ");
        int f0 = scan.nextInt();
        System.out.println("Enter f1: ");
        int f1 = scan.nextInt();
        System.out.println("Enter fn: ");
        int n = scan.nextInt();

        // Create a Fib object
        Fib myFib = new Fib(f0, f1);

        // Run iterative Fibonacci algorithm
        int fn = myFib.f(n);
        System.out.println("f(" + n + ") = " + fn);

        // Run recursive Fibonacci algorithm
        fn = myFib.fRec(n);
        System.out.println("f(" + n + ") = " + fn);

        // Close scan bc VScode doesn't like it
        scan.close();
    }

    // Class variables
    private int f0;
    private int f1;
}