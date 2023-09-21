import java.util.Scanner;
public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); // new Scanner(); creates new object which allows you to read input and then use other methods such as .nextLine()! 
		
		System.out.println("Is Majid weird?");
		String userInput = scanner.nextLine();
		
		System.out.println("Wow "+userInput+" Majid is weird");
		
		System.out.println("age?");
		int age = scanner.nextInt(); // .nextInt is used to read the next input from the user
		System.out.println("so ur"+age);
		scanner.nextLine(); // make sure u add this line << after u use the integer scanner so that the code works if u dont the code wont work
		
		System.out.println("fav food");
		String food = scanner.nextLine();
		System.out.println("ur fav food is"+food);
		
		scanner.close();
	}

}
