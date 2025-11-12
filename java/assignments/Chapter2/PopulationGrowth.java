import java.util.Scanner;

public class PopulationGrowth{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();
        System.out.print("Enter annual growth rate (e.g., 1.1 for 1.1%): ");
        double growthRate = input.nextDouble();

        growthRate = growthRate / 100 + 1; // Convert percentage to multiplier

        System.out.printf("Population after 1 year: %.0f%n", population * Math.pow(growthRate, 1));
        System.out.printf("Population after 2 years: %.0f%n", population * Math.pow(growthRate, 2));
        System.out.printf("Population after 3 years: %.0f%n", population * Math.pow(growthRate, 3));
        System.out.printf("Population after 4 years: %.0f%n", population * Math.pow(growthRate, 4));
        System.out.printf("Population after 5 years: %.0f%n", population * Math.pow(growthRate, 5));
    }
}