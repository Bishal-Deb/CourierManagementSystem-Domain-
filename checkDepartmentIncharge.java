abstract class Department                                                  //abstract class
{ 
    protected String deptName;
    boolean isExists;

    // Department class parameterized constructor
    public Department(String deptName) {
        this.deptName = deptName;                                //using this keyword to give reference 
        this.isExists=false;
    }

    public final String getdeptName() {                                      //using final keyword
        return deptName;
    }

    abstract boolean getOwnership();

}

// derived class one
class office extends Department

{

    public office(String deptName) {
        // calling Department class constructor
        super(deptName);
    }


    public boolean getOwnership() {
        if (getdeptName() == "Sanjay Aggarwal") {
            isExists=true;
        }
        return isExists;
    }
	
} 

//derived class two 
class delivery extends Department 
{ 

    public delivery(String deptName) {
        
        super(deptName);
    }

   
    public boolean getOwnership() {
        if (getdeptName() == "Anil Koet" || getdeptName()=="Dev Yadav") {
            isExists=true;
        }
        return isExists; 
    }
	
} 

// Driver class 
public class checkDepartmentIncharge 
{ 
	public static void main(String[] args) 
    {  
        String name="Check the Department Heads and the Numberof employees under him/her.";                                            //String class
        System.out.println("..................................................................");
        System.out.println(name);
        System.out.println(".................................................................."+"\n");
		// creating office object 
		Department s1 = new office("Sanjay Aggarwal"); 
		
		// creating delivery object 
		Department s2 = new delivery("Dev Yadav"); 
        
        StringBuffer s = new StringBuffer("Official");                                //StringBuffer class
        s.append(" work is managed by ");
        s.append(s1.getdeptName());
        s.append(":- ");
        s.append(s1.getOwnership());
		System.out.println(s);
		System.out.println("30 Official Staffs under him." + "\n");
        
        
        StringBuffer st = new StringBuffer("Delivery"); 
        st.append(" department is managed by ");
        st.append(s2.getdeptName());
        st.append(":- ");
        st.append(s2.getOwnership());
		System.out.println(st);
		System.out.println("20 employees under him.");
		 
		
	} 
} 