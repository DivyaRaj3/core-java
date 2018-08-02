import java.util.Scanner;
public class stag
{
    public static void main(String[] args) 
    {
        double  temp[]=new double[5]; int c=0; int index=0;
	double age[]=new double[5];
	String na[]=new String[5];
	String n=" ";
        Scanner s = new Scanner(System.in);

      // System.out.println("Enter name: ");
        for (int i = 0; i < 5; i++) 
        {	System.out.print("Enter name: ");
            na[i] = s.next();
        }
        
        for (int i = 0; i < 5; i++) 
        { System.out.print("Enter age: ");
            age[i] = s.nextDouble();
        }
        for (int i = 0; i < 5; i++) 
        {
            
             if (age[i]>=18) 
                {
                   
                   c++;
                }
		
           
        }

        System.out.print("total no of students eleigible for grad :" +c);
	//System.out.print("Name of highest scorer :" +na[index]);
 }       
}