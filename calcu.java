import java.util.Scanner;


public class calcu 
{


    public static void main(String[] args) 
   {

        Scanner s = new Scanner(System.in);

        System.out.println("Simple Calculator");
	double a,b,sum,diff,pro,quo,per;
	System.out.print("Enter 1st no: ");
	a=s.nextDouble();
	
	System.out.print("Enter 2nd no: ");
	b=s.nextDouble();
	int ch;
	do
	{
        	System.out.println("\nHere are your options:");
        	System.out.println("\n1. Addition");
        	System.out.println("2. Subtraction");
        	System.out.println("3. Multiplication");
        	System.out.println("4. Division");
		System.out.println("5. Percent");
		System.out.println("6. Exit");
       		 System.out.print("\nWhat would you like to do?: ");
        	 ch = s.nextInt();
        

		switch(ch)
        	{
           case 1:
                sum = a+b;
		System.out.println("Sum is: "+sum );
                break;

            case 2:
                diff = a-b;
		System.out.println("Diff is: "+diff );
                break;

            case 3:
                pro= a*b;
		System.out.println("Pro is: "+pro );
                break;

            case 4:
               quo = a/b;
		System.out.println("quo is: "+quo);
                break;
	    case 5:
                per= (a/b)*100;
		System.out.println("percent is: "+per);
                break;
		
	     case 6: 
			System.out.printf("Exiting...");
			 break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! option is not correct");
                return;
        	}


	}while(ch!=6);
  }
}