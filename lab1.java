import java.util.Scanner;


public class lab1 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      Scanner stdin = new Scanner(System.in);
      String array[] = new String[5];

       System.out.println("Want to add new order Details for sure? (y/n)");

      if (stdin.next().startsWith("y")){
      	for (int i = 0 ; i < 5; i++ ) {
           System.out.println("Enter the details fot the new order: ");
           array[i] = input.next();
        }
        
        System.out.println("New order details: ");
      }

        printArray(array);

        input.close();
        stdin.close();
   }
   public static void printArray(String arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    	}
	}
}