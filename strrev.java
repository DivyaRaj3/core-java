import java.util.*;
class strrev
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");	
		String st=s.next();
		char [] a=st.toCharArray();
		System.out.println("reversed string: ");	
		int l=a.length;
		for(int i=l;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}		