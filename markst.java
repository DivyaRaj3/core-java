import java.util.Scanner;
public class markst 
{
    public static void main(String[] args) 
    {
        double  temp=0,max=0; int index=0;
	double marks[]=new double[5];
	String na[]=new String[5];
	String n=" ";
        Scanner s = new Scanner(System.in);

       System.out.println("Enter name: ");
        for (int i = 0; i < 5; i++) 
        {
            na[i] = s.next();
        }
        System.out.println("Enter marks: ");
        for (int i = 0; i < 5; i++) 
        {
            marks[i] = s.nextDouble();
        }
        for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (marks[i] >marks[j]) 
                {
                    temp = marks[i];
                   
                }
		else
		{
			temp = marks[j];
			
		}
            }
        }
	
	for(int i=0;i<5;i++)
	{
		if (temp==marks[i]) index=i;
	}	

        System.out.print("Max marks is :" +temp);
	System.out.print("Name of highest scorer :" +na[index]);
 }       
}