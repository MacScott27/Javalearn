import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Please enter your last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter how many siblings you have: ");
		int size = scanner.nextInt();
		scanner.nextLine();
		String[] eachSibling = new String[size];
		System.out.println("Enter one siblings first name, press enter than enter the next: ");
		
		for(int i = 0; i < size; i++){
			
			eachSibling[i] = scanner.nextLine();
		}
		
		System.out.println("Hello " + name + " " + lastName);
		
		for(int i = 0; i < size; i++) {
			System.out.println("Hello " + eachSibling[i] + " " + lastName);
		}
	}

}
