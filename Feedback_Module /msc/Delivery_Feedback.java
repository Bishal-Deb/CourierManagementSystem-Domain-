package msc;
public class Delivery_Feedback
{
     public int track_no;
     public String cust_name;
     public String DeliBoy_name;
     public int a,b,c;
     int sum=0;
     int i = 5;

    public void Timer()
    {
        System.out.println("Feedback Calculating.......\nPresenting in:");
        while (i>0){
          
         System.out.println(i+"  Seconds");
         try {
           i--;
           Thread.sleep(1000L);     //thread implemented
           
          }
          catch (InterruptedException e) {
             System.out.println(e.getMessage());
          }
        }
    }

     public Delivery_Feedback(int track, String nm, String dbn, int m1,int m2,int m3)
     {
          track_no = track;
          cust_name = nm;
          DeliBoy_name=dbn;
          a = m1;
          b = m2;
          c = m3;
          sum = a+b+c;
     }
     public void display()
     {
          System.out.println("\nTracking Number : "+track_no);
          System.out.println("Customer Name    : "+cust_name);
          System.out.println("Delivery Person Name    : "+DeliBoy_name);
          System.out.println("\n-----Feedbacks-------");
          System.out.println("Behaviour  : "+a);
          System.out.println("Punctuality  : "+b);
          System.out.println("Address Searching : "+c);
          System.out.println("Total Feedback     : "+sum);
           if(sum>12 && sum<=15)
          {
             System.out.println("\nResult = Excellent\n");
          }
          else if(sum>9 && sum<=12)
         {
            System.out.println("\nResult = Very Good\n");
         }
         else if(sum>6 && sum<=9)
        {
           System.out.println("\n Result = Good\n"); 
        }
        else if(sum>3 && sum<=6)
       {
         System.out.println("\nResult = Fair\n"); 
       }
       else if(sum<= 3)
       {
         System.out.println("\nResult = Poor\n"); 
       }
       else if(sum > 15)
       {
         System.out.println("Please enter feedbacks between 1 and 5 ");
       }
          
       System.out.println("------------------");
     }
}