public class StaticMethodWithParameter{
	public static void main(String[] args){
		addition(800,567,34);
		addition(80,21,7);
		
	}
	public static void addition(int num1,int num2,int num3){
		int sum = num1 + num2 + num3;
		
		System.out.printf("The sum is %d%n",sum);
	}
}