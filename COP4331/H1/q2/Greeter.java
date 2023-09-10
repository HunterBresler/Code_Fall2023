/* 
    Author: Hunter Bresler
    Class Greeter: Keeps track of names and performs functions on them
*/

package H1.q2;

public class Greeter 
{
    // Constructor
    public Greeter(String aName)
    {
        name = aName;
    }    

    // Returns "Hello name!"
    public String sayHello()
    {
       return "Hello, " + name + "!";
    }

    // Swaps the names of 2 Greeter objects
    public void swapNames(Greeter other)
    {
        String temp = this.name;
        this.name = other.name;
        other.name = temp;
    }

    // returns a new Greeter object with name: this.name + " " + qualifier
    public Greeter createQualifiedGreeter(String qualifier)
    {
        return new Greeter(this.name + " " + qualifier); 
    }

    private String name;
}
