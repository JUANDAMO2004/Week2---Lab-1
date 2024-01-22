package myAssignment1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FootballExecution {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount of players to register: ");
		
		int playerAmount = scanner.nextInt();
		scanner.nextLine();
		
		Football[] players  = new Football[playerAmount];
		for(int i =0; i < playerAmount; i++) {
			System.out.println("\nEnter the player details " + (i + 1)+ ":");
			System.out.print("Name : ");
			String name = scanner.nextLine();
			System.out.print("Age : ");
			int age = validateInteger(scanner);
			double price;
			do {
				System.out.print("Price: ");
				price = scanner.nextDouble();
				scanner.nextLine();
				if(price > 1000) {
					System.out.println("This player is highest price than limit of budget:");
				}
			} while (price > 1000);
			
			System.out.print("Club : ");
			String club = scanner.nextLine();
			
		Football player = new Football(name, club, age, price);
		players[i] = player;
		
		}
		System.out.println("\nPlayer Details: ");
		for(Football player:players) {
			System.out.println(player );
		}
		
	}
	private static int validateInteger(Scanner scanner) {
		while(true) {
			try {
				return scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Please, enter a valid number:");
				scanner.nextLine();
			}
		}
	}

}
