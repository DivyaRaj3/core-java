import java.util.*;
import java.lang.*;

class tog
{
	public static void main(String args[])
	{
	String st;
	System.out.println("Enter a string: ");
	Scanner s=new Scanner(System.in);
	st=s.next();
	
	char arr[]=st.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		if(Character.isUpperCase(arr[i]))
		{
			arr[i]=Character.toLowerCase(arr[i]);
		}
		else
		{
			arr[i]=Character.toUpperCase(arr[i]);
		}
	}
	System.out.println("The new string: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	}
}