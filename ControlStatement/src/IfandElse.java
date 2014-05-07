import java.util.Scanner;

public class IfandElse {

public static void main(String[] args) {
		// TODO Auto-generated method stub		
				
		int option;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hungry \n"); 
		System.out.print("Get in Line\n"); 
		System.out.print("Buy Lunch \n"); 
		
		System.out.print("Are you Thirsty? Please enter 1 if yes otherwise enter 2 ");
		option = input.nextInt();
		
		if (option == 1)
			System.out.print("Buy a Coke\n "); 		
		else
			System.out.print("Get a Water\n "); 
		
		System.out.print("Eat Lunch\n "); 
		System.out.print("Return Tray \n"); 
		System.out.print("Leave \n"); 

	}

}


		
		
		

	