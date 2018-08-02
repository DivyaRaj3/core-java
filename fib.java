import java.util.*;
class fib{  
public static void main(String args[])  
{    
 int a=0,b=1,c,i,n;    
 System.out.print(a+" "+b);//printing 0 and 1    
  Scanner s=new Scanner(System.in);
	System.out.print("Enter the digit upto which you want to print: ");
   n=s.nextInt();   
 for(i=0;i<n;i++)//loop starts from 2 because 0 and 1 are already printed    
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
  
}
}  