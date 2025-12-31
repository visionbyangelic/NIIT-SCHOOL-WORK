import java.util.Scanner;

public class EnhanceForLoop{
	public static void main(String[] args){
		//create a single dimentional array of size 10
		String[] names = new String[10];
		
		//create a single dimentional array of size 10
		int[] marks = new int[10];
		
		//create the object of the scanner class
		Scanner scan = new Scanner(System.in);
		
		//get input from users using traditional for loop
		for(int i = 0; i < 10; i++){
			System.out.print("Enter Student name: ");
			names[i] = scan.nextLine();
			
			
			System.out.print("Enter Student mark: ");
			marks[i] = scan.nextInt();
			scan.nextLine();
			
			System.out.println("=========================");
		}
		
		//Tranverse through the arrays to display the elements of the arrays
		System.out.println("Element of Names array are");
		for (String name : names){
			System.out.printf("%s%n",name);
		}
		System.out.println("Element of marks array are");
		for (int mark : marks){
			System.out.printf("%d%n",mark);
		}
	}
}