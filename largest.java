import java.util.*;
class largest
{ public static void main(String[] args)
    {
        //int smallest=0;
        int large=0; 
        int arr[]=new int[5];
	  Scanner s =new Scanner(System.in);
        System.out.println("enter the number: ");
	for(int i=0;i<5;i++)
        {   arr[i]=s.nextInt();
	}
      

//        int n=input.nextInt();

        for(int i=0;i<arr.length;i++)
        {
          
          if(arr[i]>large)
          {
           large=arr[i];
          }
	}

          System.out.println("the largest is:"+large);
	}
}
