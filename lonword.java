import java.util.*;
public class lonword
{
    public static void main(String[] args) 
    {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a string: ");
	String line=s.nextLine();
	
        String[]Words=line.split(" ");
        String lw=" "; int l=0;
        for(int i=0;i<Words.length;i++)
	{

		
                if(Words[i].length()>l)
		{
                    l=Words[i].length();
			lw=Words[i];
                }	




           /* for(int j=1+i;j<Words.length;j++)
	   {
                if(Words[i].compareTo(Words[j])>0)
		{
                    lw=Words[i];
                }
		else 
		{
			lw=Words[j];
		}
            } */
        }
        System.out.println("The longest word is: "+lw);
        System.out.println(l);
    }
}