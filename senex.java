import java.io.*;
import java.util.*;

class senex
{

public static void main(String args[])
{
try
{
	FileOutputStream f1=new FileOutputStream ("D:\\DIVYA\\vowels.txt");
	FileOutputStream f2=new FileOutputStream ("D:\\DIVYA\\cons.txt");
	int len,count;
	String vow[]={"a","e","i","o","u"};
	String s=" ";;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a sentence");
	s=sc.nextLine();
	String c[]=s.split(" ");
	len=c.length;
	
	for(int i=0;i<len;i++)
	{
		count =0;
		for(int j=0;j<5;i++)
		{
			if(c[i].startsWith(vow[j]))
			{
				c[i]=c[i].concat(" ");
				byte b1[]=c[i].getBytes();
				f1.write(b1);
				count =1;
			}
		}
		
		if(count==0)
		{
			c[i]=c[i].concat(" ");
			byte b2[]=c[i].getBytes();
			f2.write(b2);
		}
	}
	f1.close();
	f2.close();		
}
catch(IOException e)
{
	System.out.println(e);
}
}
}




