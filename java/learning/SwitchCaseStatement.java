import java.util.Scanner;

public class SwitchCaseStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int mark;
		String fullname;
		
		System.out.print("Enter youf full name: ");
		fullname = input.nextLine();
		
		System.out.println("Enter your mark: ");
		mark = input.nextInt();
		
		switch(mark/10){
			case 0:
			case 1:
			case 2:
			case 3:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is F",fullname,mark);
			break;
			
			case 4:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is E",fullname,mark);
			break;
			
			case 5:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is D",fullname,mark);
			break;	
			
			case 6:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is C",fullname,mark);
			break;
			
			case 7:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is B",fullname,mark);
			break;	
			
			case 8:
			case 9:
			case 10:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is A",fullname,mark);
			break;
			
			default:
			    System.out.println("Invalid input");
		}
	}
}