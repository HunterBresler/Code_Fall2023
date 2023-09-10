/* 
    Author: Hunter Bresler
    Class DataAnalyzer: Gets the min, max, and average of a linkedlist stored in an object
*/

package H1.q3;

import java.util.LinkedList;

public class DataAnalyzer 
{
    // Constructor
    public DataAnalyzer(LinkedList<Integer> newNumList)
    {
        numList = newNumList;
    }

    // Finds the max of the list
    public int max()
    {
        int max = numList.getFirst();

        // Iterate through linkedlist and find the min
        for (int num : numList) 
        {
            if (num > max)
            {
                max = num;
            }
        }

        // Return the max of numList
        return max;
    }

    // Finds the min of the list
    public int min()
    {
        int min = numList.getFirst();

        // Iterate through linkedlist and find the max
        for (int num : numList) 
        {
            if (num < min)
            {
                min = num;
            }
        }

        // Return the min of numList
        return min;
    }

    // Finds the average of the list
    public int average()
    {
        int avg = 0;

        // Iterate through linkedlist and find the average
        for (int num : numList) 
        {
            avg += num;
        }

        // Return the average of numList
        return avg / numList.size();    
    }

    private LinkedList<Integer> numList;
}
