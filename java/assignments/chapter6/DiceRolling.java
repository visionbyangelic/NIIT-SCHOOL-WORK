import java.security.SecureRandom;

public class DiceRolling{
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[13]; // sums from 2 to 12
        
        final int ROLLS = 36_000_000;
        
        for (int i = 0; i < ROLLS; i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            int sum = die1 + die2;
            frequency[sum]++;
        }
        
        System.out.println("Sum\tFrequency\tPercentage");
        for (int sum = 2; sum <= 12; sum++) {
            double percentage = (double) frequency[sum] / ROLLS * 100;
            System.out.printf("%d\t%,d\t\t%.2f%%%n", sum, frequency[sum], percentage);
        }
    }
}