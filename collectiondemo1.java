import java.util.*;
class collectiondemo1{
int Id,Marks;
String Name;
public collectiondemo1(int Id,String Name,int Marks)
{
this.Id=Id;
this.Name=Name;
this.Marks=Marks;
}
public String toString()
    {
        return Id+" "+Name+" "+Marks;
    }

public static void main(String [] aa)
{
int n,m;
String s;

ArrayList <collectiondemo1> arl=new ArrayList<collectiondemo1>();
Scanner sc = new Scanner(System.in);
for(int i =0;i<3;i++){
System.out.println("Type Your Id,marks  and Name...");
 n=sc.nextInt();
m=sc.nextInt();
s=sc.next(); 
collectiondemo1 cdm = new collectiondemo1(n,s,m);
arl.add(cdm);
}
/*
for(collectiondemo1 cc:arl){
System.out.println(cc);
}*/

ListIterator itr=arl.listIterator();
	while(itr.hasNext())
	{
		System.out.print("item: "+itr.next().toString()+"\t");
	}




}
}


