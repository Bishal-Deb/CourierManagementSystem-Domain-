package DeliveryPerson;
public class DelPerson
{
	public String name, address, email;
	public int phone, age;


	public DelPerson(String name, int age, int phone, String address, String email)
	{
	  this.name=name;
	  this.age=age;
	  this.phone=phone;
	  this.address=address;
	  this.email=email;
	}
	public void show()
	{
	  System.out.println("\nPerson name: "+this.name);
	  System.out.println("\nAge: "+this.age);
	  System.out.println("\nContact Number: "+this.phone);
	  System.out.println("\nAddress: "+this.address);
	  System.out.println("\nEmail: "+this.email);
	}
}