public class HelloWorld{
	public static void main (String[] agrgs) {
		
		int num = 50;
		String name = "Jack";
		Float deci = 9.99999F;
		boolean isFun = true;
		char symbol = '$';
		
		//using println method
		
		System.out.println("Hello World, this is my first Java Program");
		System.out.println("Learning java is fun");
		
		//using print method
		System.out.print("The print method should be used to accept input ");
		System.out.print("Another Print Method /n");
		
		//using printf method
		System.out.printf("I bought %d quantity of bread%n",num);
		System.out.printf("My name is %s%n",name);
		System.out.printf("Your balance is %c%.2f%n",symbol,deci);
		System.out.printf("Is Java Fun? %b%n",isFun);
		System.out.print("Do you enjoy learning \"Java\"");
	}
}