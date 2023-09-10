/* 
    Author: Hunter Bresler
    Class PrimeFactorizerTester: Tests the PrimeFactorizer class
*/

package H1.q5;

import java.util.Scanner;

public class PrimeFactorizerTester 
{
    public static void main(String[] args) 
    {
        // Get number from user
        System.out.println("Enter a number here to get it's prime factorization: ");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        myScanner.close();

        // Create PrimeFactorizer object
        PrimeFactorizer myFactorizer = new PrimeFactorizer(num);

        // Use useless function for meme
        num = myFactorizer.getN();

        // Get and print prime factorization of num
        String primeFactorization = myFactorizer.toString();
        System.out.println("The prime factorization of " + num + " is " + primeFactorization);
    }
}
