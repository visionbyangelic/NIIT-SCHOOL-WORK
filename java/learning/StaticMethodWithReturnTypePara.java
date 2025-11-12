import java.util.Scanner;
public class StaticMethodWithReturnTypePara{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String name = input.nextLine();
		
		String displayName = myName(name);
		System.out.printf("Welcome %s to my website %n",displayName);
		
		int result = addition(90,40,30);
		
		System.out.printf(" The result is %d%n",result);
	}
	public static String myName (String name){
		return name;
	}
	public static int addition(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		
		return sum;
	}
}
