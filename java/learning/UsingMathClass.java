import java.util.Scanner;

public class UsingMathClass{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number of your choice: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter any number of your choice: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter any number of your choice to find the squareroot: ");
		int squareRootNum = input.nextInt();
		
		int castedSquareRootNum =(int) Math.sqrt(squareRootNum);
		
		System.out.printf("The absolute value of the number is %d %d%n",Math.abs(num1),Math.abs(num2));
		System.out.printf("The Maximum number is %d%n",Math.max(num1,num2));
		System.out.printf("The Minimum number is %d%n",Math.min(num1,num2));
		System.out.printf("The SquareRoot  is %d%n",castedSquareRootNum);
		System.out.printf("The answer is  is %f%n",Math.pow(num1,2)*Math.pow(num2,2));
	}
}
		