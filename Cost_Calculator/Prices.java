package Cost_Calculator;

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
class Prices{  
	public void display(){  
	courier_services service_domlite= new Domestic_Lite(); 
	courier_services service_domexpress= new Domestic_Express();
	courier_services service_intlite= new International_Lite();
	courier_services service_intexpress= new International_Express();
        		System.out.println("\n********************************************************* ");
        		System.out.println("Here are the various services and their respective cost:- \n");
	                System.out.println("Domestic Lite Service Charge/Cost(per kg): Rs. "+service_domlite.price()+""); 
	            
	            	System.out.println("Domestic Ecxpress Service Charge/Cost(per kg): Rs. "+service_domexpress.price()+""); 
	             
	                System.out.println("International Lite Service Charge/Cost(per kg): Rs. "+service_intlite.price()+""); 
	            
	                System.out.println("International Express Service Charge/Cost(per kg): Rs. "+service_intexpress.price()+"\n"); 
 
	}
}  