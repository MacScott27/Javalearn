import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("If you would like to convert from cad to usd please enter to usd, ");
			System.out.println("and if you would like to convert from usd to cad please enter to cad: ");
			String answer = scanner.nextLine();
			answer.toLowerCase();

			if (answer.equals("to usd")) {
				
				System.out.println("Plesae enter amount of money to calculate in cad: ");
				double amount = scanner.nextDouble();
				scanner.nextLine();
				
				amount = amount / 1.27;
				
				System.out.println(amount);
				System.out.println("Press enter to continue: ");
				scanner.nextLine();
				
				//exit program prompt
				System.out.println("Would you like to use this program again(y, n): ");
				String input = scanner.nextLine();
				input.toLowerCase();
				if(input.equals("n")){
					break;
				}
			} 
			else if (answer.equals("to cad")) {

				System.out.println("Plesae enter amount of money to calculate in usd: ");
				double amount = scanner.nextDouble();
				scanner.nextLine();
				
				amount = amount * 1.27;
				
				System.out.println(amount);
				System.out.println("Press enter to continue: ");
				scanner.nextLine();
				
				//exit program prompt
				System.out.println("Would you like to use this program again(y, n): ");
				String input = scanner.nextLine();
				input.toLowerCase();
				if(input.equals("n")){
					break;
				}
			}
			else{
				System.out.println("Invalid Input");
				continue;
			}

		}
	}

}