package Employee;

import java.util.Scanner;

public class Employee_Details extends Employee
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

		        System.out.print("Want to add new Details for sure? (y/n): ");
		        ch= stdin.next();
		       
		    	} while(ch=="y" || ch == "Y");

		    	if (ch.equals("n")|| ch.equals("N")){
		    		System.out.println("Thank you");
		    		run=false;
	    	}
    	}
	}
}