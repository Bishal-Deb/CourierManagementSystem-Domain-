import java.util.*;
import java.io.*;

abstract class display{
	public abstract void display();
	   // 	  private int admin_id;
		  // private String name;
	// 	  private String addr;
	// 	  private String email;
	// 	  private Long mobile;
	// 	  private String pwd;
    
 //    display(int a_id,String a_name, String a_addr, String aEmail, Long mobileNo, String pwdword){

	// admin_id = a_id;
 //    name = a_name;
 //    addr = a_addr;
 //    email = aEmail;
 //    mobile = mobileNo;
 //    pwd = pwdword;
    
 //    }

 //     @Override
 //      public final String toString() {
 //           return this.pwd + "\n1."+ this.admin_id+"\n2."+this.name+"\n3."+ this.addr;
 //      }
}

class Admin extends display {
  private int admin_id;
  String name;
  private String addr;
  private String email;
  private Long mobile;
  private String pwd;

  final String[] service={"Domestic Lite","Domestic Express","International Lite","International Express"};
  int[]  prices={50,100,200,500};
  int Choice,Quantity;

  public Admin() {

  }

  public Admin(int a_id,String a_name, String a_addr, String aEmail, Long mobileNo, String pwdword) {
    admin_id = a_id;
    name = a_name;
    addr = a_addr;
    email = aEmail;
    mobile = mobileNo;
    pwd = pwdword;
  }

  public Admin(int a_id,String a_name, String a_addr, String pwdword, Long mobileNo) {
    admin_id = a_id;
    name = a_name;
    addr = a_addr;
    pwd = pwdword;
    mobile = mobileNo;
  }

  public String getEmail() {
    return email;
  }

  public Long getmobileNo() {
    return mobile;
  }

  public String getpwdword() {
    return pwd;
  }	

  @Override
  public void display(){
  	   System.out.println("Customer Id is - " + this.admin_id);
	   System.out.println("Name is - " + this.name);
	   System.out.println("addr is - " + this.addr);
	   if (this.email != null || this.email != "") {
	       System.out.println("Email is - " + this.email);
	   }
	   System.out.println("mobile no is - " + this.mobile);
	   System.out.println("\n\n");
  }
}

class Signup extends Admin {
  private String email;
  private String username;
  private String pwd;

  void login(String email, String pwd, Admin cust) {
    
     if (email.equals(cust.getEmail()) && pwd.equals(cust.getpwdword())) {
      System.out.println("Successfully logged in with email");
      // System.exit(0);
    } else {
      System.out.print("Wrong Credentials");
      // System.exit(0);
    }
  }

  void login(Long mobile, String pwd,Admin cust) {
    if (mobile.equals(cust.getmobileNo()) && pwd.equals(cust.getpwdword())) {
      System.out.println("Successfully logged in with phone no");
      // System.exit(0);
    } else {
      System.out.print("Wrong Credentials");
      // System.exit(0);
    }

	System.out.println("Hello: " + super.name);
  }
}
public class welcome {
  public static Admin getData(String method) {
    Scanner sc = new Scanner(System.in);
    System.out.println("------Enter Details of Customer----");

    Random rand = new Random();
    int cid= rand.nextInt(1000);

    System.out.print("Enter Your Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Your address: ");
    String addr = sc.next();

    System.out.print("Enter Your mobile no: ");
    Long mobile = sc.nextLong();
    if (String.valueOf(mobile).length() != 10) {
      System.out.println("Incorrect contact number");
      System.exit(0);
    }

    String email = "";
    if (method == "email") {
      System.out.print("Enter Your Email: ");
      email = sc.next();
      String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      if (email.matches(regex) == false) {
        System.out.println("Enter a proper Email Id.");
        System.exit(0);
      }

    }

    Console console = System.console();
    String pwdwordArray = new String(console.readPassword("Enter your password(it must be atleast 5 character): "));

    if (pwdwordArray.length() < 5) {
      System.out.println("Invalid password length");
      System.exit(0);
    }
    if (method == "email") {
      return new Admin(cid,name, addr, email, mobile, pwdwordArray);
    } else {
      return new Admin(cid,name, addr, pwdwordArray, mobile);
    }
    
  }
  public static void main(String[] args) {
    System.out.println("\nWelcome to the Courier Management system");
    System.out.println("Author- Bishal Deb.");
    System.out.println("Register Number- 2047108.");
    System.out.println(".........................\n");

    // loop through all arguments
    for(String str: args) {
      System.out.println(str);
    }

    Admin new_admin = new Admin();
    //Admin ad1 = new Admin();
    // Signup log = new Signup();
    Scanner sc = new Scanner(System.in);
    int ch, price;

    do {
        System.out.println("1.Register\n2.Login\n3.Display\n4.Exit");
        System.out.println("Your choice : ");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
            	
                System.out.println("1. Register using email ");
                System.out.println("2. Register using mobile ");
                System.out.print("Enter Your Choice: ");
                int ch1 = sc.nextInt();
                if (ch1 == 1) {
                    new_admin = getData("email");
                    break;
                } 
                else 
                {
                    new_admin = getData("mobile");
                    break;
                }

	        }
	    } while (ch != 4);

	// 

  }
}


  


   