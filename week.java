import java.io.*;
import java.util.*;
class week
{
	public static void main(String args[])
	{
	int week;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no for day of week");
	week=s.nextInt(); 
	switch(week)
	{
		case 1 : System.out.println("mon"); break;
		case 2 : System.out.println("tue"); break;
		case 3: System.out.println("wed"); break;
		case 4: System.out.println("thurs"); break;
		case 5: System.out.println("fri"); break;
		case 6: System.out.println("sat"); break;
		case 7: System.out.println("sun"); break;
		default:System.out.println("Invalid"); break;
	}
	}	
}