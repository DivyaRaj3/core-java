import java.util.*;

class passdemo1
{
	String na,password;
	public int no;
	Scanner s=new Scanner(System.in);
	char arr[]={'#','*','+','-','$','&','=','%','/','@'};
	void inp()
	{	System.out.println("Enter name: ");
		na=s.next();
		System.out.println("Enter number: ");
		no=s.nextInt();
		
		
	}
	
	char fl()
	{
		char t[]=na.toCharArray();
		int l=t.length;
		char s1=t[0];
		//char s2=t[l-1];
		return s1;
	}
	char ll()
	{
		char t[]=na.toCharArray();
		int l=t.length;
		//char s1=t[0];
		char s2=t[l-1];
		return s2;
	}

	int dgtsum()
	{
		int sum=0; 
		int n=0;
		n=no;
		while((n>0)||(sum>9))
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum=sum+n%10;
			n=n/10;
		}
		
		return sum;
	}
	
	char mapping(int d)
	{
		char sym;
		sym=arr[d];
		return sym;
	}
	
	int fdg()
	{
		int first = no;
		while(first >= 10)
    		{
        		first = first / 10;
    		}

		return first;
	}
	
	public static void main(String args[])
	{
		

		passdemo1 ob=new passdemo1();
		ob.inp();
		ob.fl();
		int dg=ob.dgtsum();
		char sy=ob.mapping(dg);
		int fir=ob.fdg();
		char f=ob.fl();
		char last=ob.ll();
		System.out.println("The password is: " +f+sy+fir+last);
	}
}
		






		
































		