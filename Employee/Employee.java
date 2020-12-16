package Employee;

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


