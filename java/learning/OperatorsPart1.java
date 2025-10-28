public class OperatorsPart1{
		public static void main(String[] args){
		int num = 50;
		
		num += 8;
		System.out.printf("The value of num is %d%n",num);
		
		num -= 7;
		System.out.printf("The value of num is %d%n",num);
		
		num *= 10;
		System.out.printf("The value of num is %d%n",num);
		
		num /= 5;
		System.out.printf("The value of num is %d%n",num);
		
		num %= 3;
		System.out.printf("The value of num is %d%n",num);
		
		//Arithmetic operators
		int num1 = 10;
		int num2 = 4;
		String name = "Martins";
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int minus = num1 -num2;
		double divide = (double)num1/num2;
		int modulos = num1%num2;
		
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("product is %d%n",product);
		System.out.printf("difference btw num1 and num2 is %d%n",minus);
		System.out.printf("Result of num1 divde num2 is %f%n",divide);
		System.out.println(name + sum);
		System.out.printf("Modulos is %d%n",modulos);
		
		//Relational Operators
		int firstNum = 12;
		int secondNum = 15;
		boolean isGreater = firstNum > secondNum;
		boolean isLesser = firstNum < secondNum;
		boolean isGreaterThanOrEqualTo = firstNum >= secondNum;
		boolean isLessThanOrEqualTo = firstNum <= secondNum;
		boolean isNotEqualTo = firstNum != secondNum;
		boolean isEqual = firstNum == secondNum;
		
		System.out.printf("firstNum > secondNum? %b%n",isGreater);
		System.out.printf("firstNum < secondNum? %b%n",isLesser);
		System.out.printf("firstNum >= secondNum? %b%n",isGreaterThanOrEqualTo);
		System.out.printf("firstNum <= secondNum? %b%n",isLessThanOrEqualTo);
		System.out.printf("firstNum != secondNum? %b%n",isNotEqualTo);
		System.out.printf("firstNum == secondNum? %b%n",isEqual);
		
	}
}