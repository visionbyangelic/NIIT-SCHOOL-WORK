//get 10 number from user and find the sum of all the numbers

import java.util.Scanner;


public class sum{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	int num;
	int i = 1;
	int sum =0; // or int num, i =1,sum =0;
	
		while (i <=10){
			System.out.printf("Enter num%d: ",i);
			num = input.nextInt();
		
			sum+= num;
			i++;
		}
		
	}
	
	}
	
	