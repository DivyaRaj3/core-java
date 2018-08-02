import java.util.*;
public class ocword
{
    public static void main(String[] args) 
    {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String line=s.nextLine();
	
        String[]Words=line.split(" ");
	
	System.out.println("Enter word to be checked: ");
	String w=s.next();
        int c=0;
        for(int i=0;i<Words.length;i++)
	{
		
		
                if(Words[i].equals(w))
		{
                    c++;
                }
	}	
		if(c==0) 
		{
			System.out.println("The word does not exist");
		}
            
        else
        {
		System.out.println("The word " +w+ "occurs "+c+ " times");
        
         }
   }
}