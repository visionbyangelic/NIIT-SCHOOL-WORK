import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double bal = 5678.98;
		
		System.out.print("Enter your firstname: ");
		String firstName = input.nextLine();
		
		
		System.out.print("Enter lastname: ");
		String lastName = input.nextLine();
		System.out.printf("Welcome %s %s to FirstBank%n",firstName,lastName);
		
		
		System.out.print("Enter you age: ");
		Short age = input.nextShort();
		System.out.printf("%s %s you are %d years old%n",firstName,lastName,age);
		System.out.printf("Your balance is $%.2f%n",bal);
	}
}	