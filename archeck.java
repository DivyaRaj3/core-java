import java.util.*;
class archeck
{
	int ar[]={1,5,6,8,1,5};
	int no[]=new int[6];
	//int ar[]={1,5,6,8,1,5};
	int n;
	Scanner s=new Scanner(System.in);
	void calc()
	{
		System.out.println("Enter a single dgt no: ");
		n=s.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<no.length;j++)
			{
				if(n==ar[i])
				{	
				no[j]=i;
				}
				else
				{
				no[j]=-1;
				}
			}
		}
		
		System.out.println("the no:"+n+"\t");
		
	/*	for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<no.length;j++)
			{
				if(n==ar[i])      
				{	
				System.out.println(no[j]+",");
				}
				else
				{
				System.out.println(no[j]);
				}
			}
		}   */
	
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<no.length;j++)
			{
				if(n==ar[i])      
				{	
				System.out.println(no[j]+",");
				}
				else
				{
				System.out.println(no[j]);
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		archeck ob=new archeck();
		ob.calc();
	}
}		