import java.util.*;

class staticLab{
	
	static int wt,w;
	
	static{
		wt= 10000;
		System.out.println("The total weight: "+ wt + "\n");
	}

	static void Parcel(){
		System.out.println("Enter the Package weight: ");
		Scanner input= new Scanner(System.in);
		w= input.nextInt();
		wt= wt-w;
		System.out.println("Balance weight: "+ wt+ "\n");
	}

	static void HeavyCargo(){
		System.out.println("Enter Cargo weight: ");
		Scanner input= new Scanner(System.in);
		w=input.nextInt();
		wt= wt-w;
		System.out.println("\nRemaining Balance weight: "+ wt);
	}

	public static void main(String args[]){
		
		Parcel();
		HeavyCargo();

		System.out.println("\nSucessfully entered the Details and checked the Balanced weight.");

	}
}