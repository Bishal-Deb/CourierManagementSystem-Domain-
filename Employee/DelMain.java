import DeliveryPerson.DelPerson;
import java.util.*;
import java.io.*;

public class DelMain{

	public static void main(String args[])throws IOException{ 
		Scanner dr=new Scanner(System.in);
		DataInputStream dr1= new DataInputStream(System.in);

		System.out.println("\nEnter number of Entry: ");
			 int n=dr.nextInt();
			 ArrayList<DelPerson> delivery=new ArrayList<DelPerson>();
			 for(int i=0; i<n; i++)
			  {
			   System.out.println("Enter Person name: ");
			   String name=dr1.readLine();
			   System.out.println("Enter Person's age: ");
			   int age=dr.nextInt();
			   System.out.println("Enter Contact Number: ");
			   int phone=dr.nextInt();
			   System.out.println("Enter Addresst: ");
			   String address=dr1.readLine();
			   System.out.println("Enter Email id: ");
			   String email=dr1.readLine();

			   DelPerson dp=new DelPerson(name, age, phone, address, email);

			   delivery.add(dp);
			   //dp.show();
			  }
			  Iterator itr=delivery.iterator();
			  while(itr.hasNext())
			  {
			    DelPerson d_per=(DelPerson)itr.next();
			    System.out.println("\n-----Entered Details-----");
			    System.out.println("\nPerson Name: "+d_per.name);
			    System.out.println("Person's Age: "+d_per.age);
			    System.out.println("Person's Contact Number: "+d_per.phone);
			    System.out.println("Person's Address: "+d_per.address);
			    System.out.println("Patient's Email id: "+d_per.email);
			  }
		}
}