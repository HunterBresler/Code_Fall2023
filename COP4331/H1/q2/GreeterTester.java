/* 
    Author: Hunter Bresler
    Class GreeterTester: Tests the greeter class 
*/

package H1.q2;

public class GreeterTester 
{
    public static void main(String[] args) 
    {
        // Test createQualifiedGreeter()
        // Create Greeter object and qualifier
        Greeter firstName = new Greeter("Hunter");
        String lastName = "Bresler";

        // Run createQualifiedGreeter()
        Greeter fullName = firstName.createQualifiedGreeter(lastName);

        // Print results
        String greeting = fullName.sayHello();
        System.out.println(greeting);

        // Test swap names
        // Create Greeter object and say hello
        Greeter swap = new Greeter("Test");
        greeting = swap.sayHello();
        System.out.println(greeting);

        // Swap names with fullName above^^
        swap.swapNames(fullName);
        
        // Print swap's new name
        greeting = swap.sayHello();
        System.out.println(greeting);
    }

}
