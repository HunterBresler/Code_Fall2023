/* 
    Author: Hunter Bresler
    Class DataAnalyzerTester: Tests the DataAnalyzer class 
*/

package H1.q3;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataAnalyzerTester 
{
    public static void main(String[] args) 
    {
        // Create a linkedlist with the values from user
        LinkedList<Integer> numList = new LinkedList<Integer>();
        
        // Get list of numbers from user
        Scanner scan = new Scanner(System.in);

        // Ask for numbers
        String num = "";
        System.out.println("Enter numbers to fill up list of data: ");

        // Loop till user enters every number
        while(!num.equals("exit"))
        {
            try 
            {
                num = scan.nextLine();
                if (!num.equals("exit"))
                {
                    numList.add(Integer.parseInt(num));
                }
            }
            catch (Exception e)
            {
                System.out.println("Only numbers and \"exit\" are accepted.");
            }
            finally
            {
                if (!num.equals("exit"))
                {
                    System.out.println("Next number(exit with \"exit\"): ");
                }
            }
        }

        // Get filename
        System.out.println("Enter the file you would like to save them to: ");
        String fileName = scan.nextLine();
        scan.close();

        // Create class object
        DataAnalyzer myData = new DataAnalyzer(numList);

        // Get and print the min of numList
        int min = myData.min();
        System.out.println("The min of numList is: " + min);

        // Get and print the max of numList
        int max = myData.max();
        System.out.println("The max of numList is: " + max);

        // Get and print the maverage of numList
        int average = myData.average();
        System.out.println("The average of numList is: " + average);

        //Create and write to file
        // Exception handling
        try 
        {
            // Create File
            File myFile = new File(fileName);
            if (myFile.createNewFile()) // if a new file is created
            {
                System.out.println("File created: " + myFile.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }

            // Write numList to file
            FileWriter myWriter = new FileWriter(fileName);

            // Iterate through numList and write into file
            for (int i : numList) 
            {
                myWriter.write(i + " ");
            }

            // Write the min, max, average into the file
            myWriter.write("\nThe min of the numbers is: " + min);
            myWriter.write("\nThe max of the numbers is: " + max);
            myWriter.write("\nThe average of the numbers is: " + average);

            // Close file
            myWriter.close();
        } 
        catch (IOException e) 
        {
            System.out.println("A File error occurred.");
            e.printStackTrace();
        }
    }
}
