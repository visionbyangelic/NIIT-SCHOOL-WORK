public class StaticMethod{
	public static void addition(){
		int num1 = 50;
		int num2 = 200;
		int num3 = 7;
		int sum = num1 + num2 + num3;
		
		System.out.printf("The sum is %d%n",sum);
	}
	public static void main(String[] args){
		addition();
	}
}