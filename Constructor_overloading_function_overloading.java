import java.util.*;

class Employee
{
    String name;
    String Office;
    String Department;
    // String EmpId;

    Random rnum = new Random();
    String EmpId= "EID/"+rnum.nextInt(10000);

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Name : "); 
        this.name= sc.nextLine();
    }

    public String getEmpId() {
        return EmpId;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Office : ");  
        this.Office= sc.nextLine();
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Department : ");  
        this.Department= sc.nextLine();
    }

    public void display(){
        System.out.println("\nName of Employee= "+ getName());
        System.out.println("Id of Employee= "+ getEmpId());
        System.out.println("Office Name of Employee= "+ getOffice());
        System.out.println("Department of Employee= "+ getDepartment());
    }

    Employee(String name, String Office, String Department){
        this.name = name;
        this.Office = Office;
        this.Department = Department;        
    }

    Employee(){
        this.EmpId = EmpId;
    }

    void info() {
      System.out.println(".........................................");
   }

   void info(String s) {
      System.out.println( "Details Entered sucessfully with Name: "+ s);
   }
}


public class Constructor_overloading_function_overloading
{
    
    
    public static void main (String arg[]){
        
       
        Employee empOne = new Employee();
        Scanner input = new Scanner(System.in);
      	Scanner stdin = new Scanner(System.in);

        String ch;
        boolean run = true;
        while(run){
	        do{
	      	
		        empOne.setName();
		        String name = empOne.getName();

		        
		        empOne.setOffice();
		        String office = empOne.getOffice();

		        
		        empOne.setDepartment();
		        String department = empOne.getDepartment();


		        Employee details = new Employee(name,office,department);
		        details.display();

		        empOne.info();
		        details.info(empOne.getName());

		        System.out.print("Want to add new order Details for sure? (y/n): ");
		        ch= stdin.next();
		       
		    	} while(ch=="y" || ch == "Y");

		    	if (ch.equals("n")|| ch.equals("N")){
		    		System.out.println("Thank you");
		    		run=false;
	    	}
    	}
	}
}