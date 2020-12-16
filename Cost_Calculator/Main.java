package Cost_Calculator;

import java.util.Scanner;
        
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Prices p= new Prices();
        Cost_Calculator ob1= new Cost_Calculator();
        packing ob2= new packing();
        p.display();
        Thread t1= new Thread(ob1);              //thread implementation
        Thread t2= new Thread(ob2);
        
        t2.start();

          try{
            ;
            Thread.sleep(7000);
          }
          catch(InterruptedException e)
          {System.out.println(e);} 
        t1.start();
       
        
        
        
    }
}