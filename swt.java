import java.*;
import java.util.*; 
class swt {
 
    public static void main(String a[])
    {
	 Scanner s=new Scanner(System.in);
	System.out.print("Enter 1st no: ");
  	 int x=s.nextInt();   
	System.out.print("Enter 2nd no: ");
	int y=s.nextInt();		
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
             + " x = " + x + ", y = " + y);
    }
}