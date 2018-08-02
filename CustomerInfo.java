import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class CustomerInfo {
   public static void main(String [] aa)
{	
    Validate_Customer ValCus=new Validate_Customer();
    ValCus.validate();
  //  col cdm = new col(ValCus.id,ValCus.name,ValCus.gen,ValCus.age,ValCus.add,ValCus.city,ValCus.c,ValCus.pin,ValCus.ph,ValCus.inter,ValCus.dob);




// writing records into file

/*	FileWriter fw=new FileWriter("D:\\collrec.txt");    
        fw.write(" ");    
        fw.close();    
*/

	
	
}   }

/*class col
{
 int cage;
String cid,cname,cgen,cadd,ccity,cc,cpin,cph,cint,cdob;
public col(String cid,String cname,String cgen , int cage, String cadd,String ccity,String cc,String cpin,String cph,String cint,String cdob)
{
   
this.cid=cid;
this.cname=cname;
this.cgen =cgen ;
this.cage =cage ;
this.cadd =cadd ;
this.ccity= ccity;
this.cc= cc;
this.cpin = cpin;
this.cph =cph ;
this.cint = cint;
this.cdob =cdob ;
}
 @Override
 public String toString()
    {
        
	return	cid +" "+cname+" "+cgen+" "+cage+" "+cadd+" "+ccity+" "+cc+" "+cpin+" "+cph+" "+cint+" "+cdob;
    }*/
}
class Validate_Customer{
    int i=0;
    int age;
String id,name,gen,add,city,c,pin,ph,inter,dob;
public void validate()
{
	//Date dob=new Date();

	ArrayList <String> arl=new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	for(int I =0;I<3;I++)
	{
	System.out.println("Type Your Id:");
	id=sc.next();

	// 1. validating id

	int l=id.length();
	String idupper =id.toUpperCase();
  	

	do
	{
		if(idupper.startsWith("C")&&(l<=4))
		{
		System.out.println("Accepted");
                i=1;
		}
		else 
		{
		System.out.println("Invalid id. Pls enter an id that starts with 'c' and not more than 4 char!! ");
		System.out.println("Re-enter Your Id:");
		id=sc.next();
		idupper =id.toUpperCase();
		}
	}while(i==0);

	// 2. validating name

		System.out.println("Type Your name: ");
		name=sc.next();	
	do
	{
		if(name.isEmpty())
		{
		System.out.println("Invalid name. Name should not be blank!! ");
		System.out.println("Re-enter Your name:");
		name=sc.next();
               
		}
		else 
		{
		System.out.println("Accepted");
                 i=2;
		}
	}while(i==1);

	// 3. validating gender

	System.out.println("Type Your gender(m/f): ");
	gen=sc.next();
	String genl =gen.toLowerCase();
	

	do
	{
	if(genl.equals("m")||genl.equals("f"))
	{
		System.out.println("Accepted");
		i=3;
		
	}
	else
	{
		System.out.println("Invalid gender. gender should be m or f!! ");
		System.out.println("Re-enter Your gender:");
		gen=sc.next();
		genl =gen.toLowerCase();
	}
	}while(i==2);
		


System.out.println("Type Your age: ");
age=sc.nextInt();
System.out.println("Type Your address: ");
add=sc.next();
System.out.println("Type Your city: ");
city=sc.next();
System.out.println("Type Your country: ");
c=sc.next();
System.out.println("Type Your pin: ");
pin=sc.next();
	//4. validating phone no
	System.out.println("Type Your phone no: ");
	ph=sc.nextLine();
	
		if(ph.isEmpty())
		{
		System.out.println("Accepted. u have not entered any no!!");
		}
		else 
		{
		System.out.println("Accepted . you have  entered a no ");
		}

	// 5. validating interests

	System.out.println("Type Your 2  interests separated by , : ");
	inter=sc.nextLine();
	String Words[]=inter.split(",");
	int count=2; // so that it takes only first two words
	String inte[]=new String[2];
	for(int j=0;j<count;j++)
	{
	inte[j]=Words[j];
	}
	/* for(j=0;j<count;j++)
	{
	System.out.println(inte[j]);
	} */

	// 6. validating date

	//DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
	System.out.println("Type Your dob. Enter any date in 8 digits (ddmmyyyy) format: ");
	
	dob=sc.next(); 
	
	int le;
	do
	{
            le=dob.length();
	if(le!=8)
	{
	System.out.println("Invalid. pls enter 8 digit date format!!");
	dob=sc.next();
	
	le=dob.length();
        
	}
	else
	{
	System.out.println("valid length in dob");
	int cdate=Integer.parseInt((dob.substring(0,2)));
        int cmon=Integer.parseInt((dob.substring(2,4)));
        int cyear=Integer.parseInt((dob.substring(4)));
       
        if(cdate>0 && cdate<32 && cmon>0 && cmon<13 && cyear<2018 && cyear>1900)
        {
	System.out.println("valid format in dob");
          String cd=Integer.toString(cdate);
	  String cm=Integer.toString(cmon);
	  String cy=Integer.toString(cyear);
          dob.concat(cd).concat(cm).concat(cy);
	System.out.println(dob);
         i=4;
        }
        else{
         System.out.println("not a valid date");
       dob=sc.next(); 
	 }
        }
	}while(i==3);
 String s = id +","+name+","+gen+","+age+","+add+","+city+","+c+","+pin+","+ph+","+inter+","+dob; 

arl.add(s);



           try
	{    
		FileOutputStream f1=new FileOutputStream ("d:\\divya\\collrec.txt");
		byte b[]=s.getBytes();
		f1.write(s);
		f1.close();    
                System.out.println("success...");    
        }
	catch(Exception e)
	{
	System.out.println(e);
	}    


} // for validate method
        
        ListIterator itr= arl.listIterator();
	while(itr.hasNext())
	{
		System.out.print("item: "+itr.next().toString()+"\t");
	}

}



    
}

