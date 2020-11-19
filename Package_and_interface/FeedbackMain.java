import msc.Delivery_Feedback;
import java.util.*;
import java.lang.*;
import java.io.*;
class FeedbackMain
{
     public static void main(String[] args)
     {
          String nm,dbn;
          int track;
          Scanner sc = new Scanner(System.in);
          
          System.out.println("\nDIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
          System.out.println("ENTER THE DETAILES HERE");
          System.out.print("Enter Your Tracking no:= ");
          track = sc.nextInt();
          System.out.print("Enter Your Name:= ");
          nm = sc.next();
          System.out.print("Enter Delivery Person Name:= ");
          dbn = sc.next();
          int m1,m2,m3;
          System.out.println("Give feedbacks For 1)Behaviour  2)Punctuality  3)Address Searching\n");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          Delivery_Feedback s = new Delivery_Feedback(track, nm, dbn, m1, m2, m3);
          s.display();
     }
}