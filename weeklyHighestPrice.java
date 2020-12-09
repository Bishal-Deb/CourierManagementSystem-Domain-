import java.util.*; 
  
public class weeklyHighestPrice{ 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 

            List<Integer> list = new LinkedList<Integer>(); 
  System.out.println("Domestic Lite highest booking price");  
            list.add(10000); 
            list.add(900); 
            list.add(8000); 
            list.add(787654); 
            list.add(10546); 
            list.add(40656); 
            list.add(25565); 
            list.add(307878);
System.out.println(list);
            System.out.println("Max value is: "
                               + Collections.max(list)); 


            List<Integer> list1 = new LinkedList<Integer>(); 
  System.out.println("Domestic Express highest booking price");  
            list1.add(3009999); 
            list1.add(23664); 
            list1.add(225432); 
            list1.add(248964); 
            list1.add(255647); 
            list1.add(204522); 
            list1.add(216757); 
            list1.add(296432);
System.out.println(list1);
            System.out.println("Max value is: "
                               + Collections.max(list1)); 
 List<Integer> list2 = new LinkedList<Integer>(); 
  System.out.println("International Lite highest booking price");  
            list2.add(308765); 
            list2.add(236567); 
            list2.add(2246478); 
            list2.add(2476866); 
            list2.add(25768); 
            list2.add(200896); 
            list2.add(21423); 
            list2.add(297990);
System.out.println(list2);
            System.out.println("Max value is: "
                               + Collections.max(list2));
 List<Integer> list3 = new LinkedList<Integer>(); 
  System.out.println("International Express highest booking price:");  
            list3.add(2686570); 
            list3.add(236774); 
            list3.add(2879862); 
            list3.add(247685); 
            list3.add(25786876); 
            list3.add(2077764); 
            list3.add(218686); 
            list3.add(2975687);
System.out.println(list3);
            System.out.println("Max value is: "
                               + Collections.max(list3));
 
        } 
  
        catch (ClassCastException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
  
        catch (NoSuchElementException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
}