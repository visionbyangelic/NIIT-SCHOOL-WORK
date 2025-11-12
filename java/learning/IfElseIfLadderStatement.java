import java.util.Scanner;

public class IfElseIfLadderStatement{
	public static void main(String[] args){
		
		// Scanner Object has been created
		Scanner input = new Scanner(System.in);
		
		//Variable declaration
		int mark;
		String fullName;
		
		//Prompt user for input
		System.out.print("Enter your full name: ");
		fullName = input.nextLine();
		System.out.print("Enter your mark: ");
		mark = input.nextInt();
		
		if (mark>=80){
			System.out.printf("%s ->%d -> A%n",fullName,mark);
		}
		else if (mark>=75){
			System.out.printf("%s ->%d -> B%n",fullName, mark);
		}
		else if (mark>=65){
			System.out.printf("%s ->%d -> C%n",fullName, mark);
		}
		else if (mark>=55){
			System.out.printf("%s ->%d -> D%n",fullName, mark);
		}
		else if (mark>=45){
			System.out.printf("%s ->%d -> E%n",fullName, mark);
		}
		else {
			System.out.printf("%s ->%d -> F%n",fullName, mark);
		}
	}
}