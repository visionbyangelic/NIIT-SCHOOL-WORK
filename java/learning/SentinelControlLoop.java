import java.util.Scanner;

public class SentinelControlLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;

        while (true){
            System.out.print("Enter number (-1 to terminate): ");
            num = input.nextInt();

            if (num == -1){
                break;
            }

            
            if (num < 0){
                negativeCount += num;
				
            }
			if (num > 0){
				positiveCount += num;
			}
			if (num == 0){
				zeroCount += num;
			}
			sum += num;
        }

        System.out.printf("The total sum of numbers is %d%n", sum);
		System.out.printf("The total positive numbers is %d%n",positiveCount);
		System.out.printf("The total negative numbers is %d%n",negativeCount);
		System.out.printf("The total numbers 0 is %d%n",zeroCount);
    }
}
