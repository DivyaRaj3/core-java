
import java.lang.*;
 
public class PrintEvenNumbers
{
    public static void main(String rs[ ] )
    {
        int targetEvenCount = 10;
        int currEvenCount = 0;
 
        // the below for loop will continue to run as long as the number of 
        // even numbers found are less than the target number of even numbers
        // you want to print. 
        for(int i=1;currEvenCount<targetEvenCount;i++)
        {
            // This is condition which finds if current value in i is an even or not
            // if its an even number, currEvenCount is incremented by 1.
            if(i%2==0) 
            {
                currEvenCount++;  
                System.out.println("Even Number :" + i);
            }           
        }
    
    }
}