package Product_Price;

import java.util.*;
import java.io.*;

interface courier_services{  
	float price();  
}  
class Domestic_Lite implements courier_services{  
	public float price(){return 50f;}  
}  
class Domestic_Express implements courier_services{  
	public float price(){return 100f;}  
} 
class International_Lite implements courier_services{  
	public float price(){return 200f;}  
} 
class International_Express implements courier_services{  
	public float price(){return 500f;}  
}  
class Product_Price{  
	public static void main(String[] args){  
	courier_services service_domlite= new Domestic_Lite(); 
	courier_services service_domexpress= new Domestic_Express();
	courier_services service_intlite= new International_Lite();
	courier_services service_intexpress= new International_Express();

	Scanner sc = new Scanner(System.in);
	int ch;

	do {
		System.out.println("\nEnter your choice to know the price of the various services provided\n ");
        System.out.println("1. Domestic_Lite\n2. Domestic_Express\n3. International_Lite\n4. International_Express\n5. Exit");
        System.out.println("Your choice : ");
        ch = sc.nextInt();

		switch (ch) {
	            case 1:
	            	
	                System.out.println("Charge/Cost(per kg): Rs. "+service_domlite.price()+"\n"); 
	                break;

	            case 2:
	            	System.out.println("Charge/Cost(per kg): Rs. "+service_domexpress.price()+"\n"); 
	                break;
	                
	             case 3:
	                System.out.println("Charge/Cost(per kg): Rs. "+service_intlite.price()+"\n"); 
	                break;

	            case 4:
	                System.out.println("Charge/Cost(per kg): Rs. "+service_intexpress.price()+"\n"); 
	                break;
		        }
		    } while (ch != 5);
 
	}
}  