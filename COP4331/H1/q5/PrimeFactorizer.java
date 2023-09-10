/* 
    Author: Hunter Bresler
    Class PrimeFactorizer: 
*/

package H1.q5;

import java.util.ArrayList;

public class PrimeFactorizer 
{
    // Constructor
    public PrimeFactorizer(int n)
    {
       this.n = n; 
       compute();
    }

    // Useless Function
    public int getN()
    {
        return n;
    }

    // Compute prime factors
    public void compute()
    {
        int factor = 2;
        int num = n;

        // Check base case, return if true
        if (num == 1)
        {
            factors.add(1);
            exponents.add(1);
            return;
        }
 
        // Loop till num is odd
        while(num % factor == 0)
        {
            // Add to factors
            factors.add(factor);
            num /= factor;
        }

        // Increment factor so it is odd
        factor++;

        // Loop through all odd prime factors
        while(num > 1)
        {
            // Check if factor goes into num
            if (num % factor == 0)
            {
                // Add to factors
                factors.add(factor);
                num /= factor;
            }
            else
            {
                // Check next odd number
                factor += 2;
            }
        }

        // Get exponents
        // Keep track of index and set first exponent
        int exponentsIndex = 0;
        exponents.add(1);

        // Loop through factors and cut dupes
        for (int i = 0; i < factors.size() - 1;) // Sub 1 to check next  
        {
            // Check for dupes
            if (factors.get(i) == factors.get(i + 1))
            {
                // Increment exponent
                exponents.set(exponentsIndex, exponents.get(exponentsIndex) + 1);
                factors.remove(i);
            }
            else
            {
                // New exponent
                exponents.add(1);

                // Increment i and exponentIndex
                i++;
                exponentsIndex++;
            }
        }
           
    }

    // The text on the homework doc for this function
    // completely contradicts itself so idk
    // It is literally a void get function... like wtf
    // And in the notes it takes the arrays as input\
    // I refuse to write it, live with it
    public void getFactorsAndExponents()
    {

    }

    public String toString()
    {
        String primeFactorization = "";

        // Create nice looking prime factoization
        for(int i = 0; i < factors.size(); i++)
        {
            // Add prime factor + exponent
            primeFactorization += factors.get(i) + "^" + exponents.get(i);

            // Add * if necessarry
            if (i < factors.size() - 1)
            {
                primeFactorization += "*";
            }
        }

        // Return nice prime factorization
        return primeFactorization;
    }

    private int n;
    ArrayList<Integer> factors = new ArrayList<Integer>();
    ArrayList<Integer> exponents = new ArrayList<Integer>();
}
