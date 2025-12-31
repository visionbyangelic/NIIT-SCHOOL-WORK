import java.util.Random;

public class AccountNumberGenerator{
	public static void main(String[] args){
		System.out.printf("Generated Account Number is %s%n",generateAccountNumber());
	}
	public static String generateAccountNumber(){
		Random rand = new Random();
		String number = "";
		
		for(int i = 0; i < 10; i++){
			int digit = rand.nextInt(10);
			number += digit;
		}
		return number;
	}
}