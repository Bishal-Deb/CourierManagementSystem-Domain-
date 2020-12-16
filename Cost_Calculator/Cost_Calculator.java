package Cost_Calculator;

import java.util.Scanner;

public class Cost_Calculator implements Runnable {
    Scanner sc = new Scanner(System.in);
    public void run()
    {
    final int domlite=50;
    final int domexpress=100;
    final int intlite=200;
    final int intexpress =500;

    System.out.println("Enter the weight:");
    int weight=Integer.parseInt(sc.nextLine());
    System.out.println("--Service--\nEnter 1 for Domestic Lite\nEnter 2 for Domestic Express\nEnter 3 for International Lite\nEnter 4 for International Express");
    int ch = Integer.parseInt(sc.nextLine());
        switch(ch)
        {
            case 1:
                System.out.println("Total Charges= Rs "+ domlite * weight);
                break;
            case 2:  
                System.out.println("Total Charges= Rs "+ domexpress * weight);
                break;
            case 3:  
                System.out.println("Total Charges= Rs "+ intlite * weight);
                break;
            case 4:  
                System.out.println("Total Charges= Rs "+ intexpress * weight);
                break;
                
        }
    }
    
}