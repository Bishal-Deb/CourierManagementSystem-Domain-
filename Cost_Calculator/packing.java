package Cost_Calculator;

import java.util.Scanner;

public class packing implements Runnable{
    Scanner sc = new Scanner(System.in);
    public void run()
    {
        System.out.println("--Packing--\n1.Fragile\n2.Non-Fragile\n3.Documents");
        System.out.println("Enter your Choice: ");
        int ch = Integer.parseInt(sc.nextLine());
        switch(ch)
        {
            case 1:
                System.out.println("Special Care will be taken.");
                break;
            case 2:
                System.out.println("Normal Care.");
                break;
            case 3:
                System.out.println("Lamination Packing is mandatory.");
                break;
        }
        
    }
    
}