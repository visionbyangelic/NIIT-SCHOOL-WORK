package java.assignments;
public class TypeCasting {
	public static void main (String [] args) {
		//widening
		double num = 10;
		System.out.printf("The value is %f%n",num);
		//narrowing
		double price = 32.89;
		int result = (int) price;
		System.out.printf("The value is %d%n",result);
    }
}